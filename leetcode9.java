public class leetcode9 {
    public static int compress(char[] chars) {
        int i = 0;
        int length = chars.length;
        int j = 0; //new array index

        if (length == 1){ //if array is only contains one thing just return 1
            return 1;
        }

        while (i < length){ //goes through items one by one until it reaches the end
            int count = 1; //counter for repeats
            char characters = chars[i]; //initializes the first new array letter as the parameter array
            while ( i + 1 < length && chars[i] == chars [i + 1]){ //checks while the letters are the same
                count++; //counter repeats goes up
                i++; //goes up the array index
            }

            if (count == 1){ // ++ save the index at j to characters then increments it by 1
                chars[j++] = characters; //if it occurs once we dont print the number only the letter as it doesnt compress
            } else if (count > 1){
                chars[j++] = characters;
                String countString = count + "";
                for (int x = 0; x < countString.length(); x++){ //converts the number counted especially 12 to 1,2 into the array
                    chars[j++] = countString.charAt(x); //adds the counted number to the new array
                }
            }
            i++; //goes to next part of array after checking the repeated letters
        }
        return j;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        System.out.println(compress(chars));
    }
}

