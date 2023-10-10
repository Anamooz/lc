 public class leetcode {
        public static String mergeAlternately(String word1, String word2) {
            StringBuilder combined = new StringBuilder();
            int x = 0;
            while (x < word1.length() || x < word2.length()){
                if (x < word1.length()){
                    combined.append(word1.charAt(x));
                }
                if (x < word2.length()){
                    combined.append(word2.charAt(x));
                }
                x++;
            }
            return combined.toString();
        }

        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "pqrstuv";

            String method = mergeAlternately(str1, str2);
            System.out.println(method);
        }
    }

