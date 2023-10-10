public class leetcode15 {
    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int countMax = 0;
        int currentCount = 0;

        for (int i = 0; i < s.length(); i++){
            if (vowels.contains(s.substring(i, i + 1))){
                currentCount++;
            }
            if (i >= k && vowels.contains(s.substring(i - k, (i - k) + 1))){
                currentCount--;
            }
            countMax = Math.max(currentCount, countMax);
        }
        return countMax;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }
}

