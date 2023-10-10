public class leetcode2 {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){ //if strings are totally different return nothing as there is no gcd
            return "";
        }
        int numbergcd = gcd(str1.length(), str2.length()); //insert string lengths to new method to find gcd number
        return str1.substring(0, numbergcd);
    }

    public static int gcd(int a, int b){
        if (b == 0){ //base case when remainder equals 0
            return a; //will return gcd number
        }
        return gcd(b, a % b);  //recursion so when you do a % b the remainder becomes the new int b and then the old int b becomes the new int a
    }

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2)); //go to method
    }
}
