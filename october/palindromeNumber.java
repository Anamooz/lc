package october;

public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        int leftCounter = 0;
        int rightCounter = String.valueOf(x).length() - 1;
        boolean palindrome = false;
        String number = String.valueOf(x);
        if (x < 0){
            return false;
        }
        if (String.valueOf(x).length() == 1){
            return true;
        }
        for (int i = leftCounter; i < rightCounter; i++) { //checking if left side numbers = right side numbers til i hit the middle
            if (number.charAt(leftCounter) == number.charAt(rightCounter)){
                leftCounter++;
                rightCounter--;
                if (leftCounter >= rightCounter){ //once i hit the middle or when i go past thats when ik its a palindrome
                    palindrome = true;
                }
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) {
        int input = -121;
        System.out.println(isPalindrome(input));
    }
}
