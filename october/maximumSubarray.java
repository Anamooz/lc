package october;

import java.util.Arrays;

public class maximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE; //biggest negative value
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0){ //if current sum is a negative number, adding it to the next positive number doesnt make sense bc the postive number is bigger by itself so reset the temporary sum (currentSum) to 0
                currentSum = 0; //and if its all negative numbers then itll still choose the smallest negative number
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2};
        System.out.println(maxSubArray(nums));
    }
}
