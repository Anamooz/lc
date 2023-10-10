public class leetcode6 {
    public static String reverseWords(String s) {
        StringBuilder combined = new StringBuilder();
        int index = 0;

        String removeExtra = s.replaceAll("\\s+", " ").trim(); //removes more than one extra spaces with just one, then trims front and end spaces

        int length = removeExtra.length(); //length of the string after trimming it

        if (!removeExtra.contains(" ")){  //if theres no spaces
            return s;
        }

        for (int x = removeExtra.length() - 1; x >= 0; x--) { //goes down the sentence backwards
            if (removeExtra.charAt(x) == ' ') {
                index = x; //when it detects a space save the spot
                String wordAdd = removeExtra.substring(index, length); //so from the saved spot to the end, save that word and put it in wordAdd
                length = index; //now that we found a word and saved it, the new length ending will be where we found the initial space
                combined.append(wordAdd); //using string builder combine the word to the front so we can reverse the sentence
            }
        }
        combined.append(" ").append(removeExtra.substring(0, index)); //removeExtra wont have a space in the front so go from the beginning to where we last stopped to get the final word
        return combined.toString().trim();
    }


    public static void main(String[] args) {
        String s = "a  good example  ";

        System.out.println(reverseWords(s));
    }
}
