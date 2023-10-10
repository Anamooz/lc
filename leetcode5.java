 public class leetcode5 {
        public static String reverseVowels(String s) {
            char[] word = s.toCharArray(); //converts string to array
            String vowels = "aeiouAEIOU";
            int start = 0;
            int end = s.length() - 1;

            while (start < end){ //goes from beginning towards the end
                while (start < end && vowels.indexOf(word[start]) == -1){ //checks if the letter IS NOT a vowel so keeps going up an index
                    start++;
                }

                while (start < end && vowels.indexOf(word[end]) == -1){ //starting from the back checks if letter IS NOT a vowel so keeps going forward from the back
                    end--;
                }

                char temp = word[start];
                word[start] = word[end];
                word[end] = temp;

                start++;
                end--;
            }
            return String.valueOf(word);
        }

        public static void main(String[] args) {
            String s = "leetcode";
            System.out.println(reverseVowels(s));

        }
    }

