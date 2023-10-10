public class leetcode11 {
    public static boolean isSubsequence(String s, String t) {
        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

        if (s.length() > t.length()){
            return false;
        }

        if (s.isBlank()){
            return true;
        }

        int countS = 0;
        int countT = 0;
        while (countT < t.length() && countS != s.length()){
            if (stringS[countS] == stringT[countT]){
                countS++;
            }
            countT++;
        }
        return countS == s.length();
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";

        System.out.println(isSubsequence(s,t));
    }
}

