public class leetcode16 {
    public static int longestOnes(int[] nums, int k) {

        int i = 0; //goes through entire array
        int j = 0;

        while (i < nums.length){
            if (nums[i] == 0){ //if a number is 0, subract 1 from k
                k--; //k will go negative
            }
            if (k < 0){ //when k's negative
                if (nums[j] == 0){ //and if the second pointer encounters a 0
                    k++; //add back another k because the window leaves nums[j]
                }
                j++; //move the j pointer up
            }
            i++; //going through the entire array one by one
        }
        return i - j; //subtracts array size minus where the j stops which is essentially the window size
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        System.out.println(longestOnes(nums, k));
    }
}

