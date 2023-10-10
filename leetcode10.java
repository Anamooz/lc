import java.util.Arrays;

public class leetcode10 {
    public static void moveZeroes(int[] nums) {

        int index = 0;

        if (nums.length == 1){
            return;
        }

        for (int i = 0; i < nums.length; i++) { //goes through entire array
            if (nums[i] != 0){ //if the number's not zero
                if (i != index) { //and if the index isnt the same as i so we don't start putting zeros with non zeros numbers because there arent any zeros
                    nums[index] = nums[i];  // whatever index they find it at, swap it with the first zero they encountered which "index" keeps track of
                    nums[i] = 0;            // then the index at wherever they found a non-zero, make it become zero to finalize the swap
                }
                index++; // then index goes onto the next zero, the for loop will keep skipping til we find the next non zero's index
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);
    }
}
