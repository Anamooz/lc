import java.util.Arrays;

public class leetcode14 {

    public static double findMaxAverage(int[] nums, int k) {
        double maxAdd = 0;
        double current = 0;

        for (int i = 0; i < k; i++) {
            current += nums[i]; //first k values added
            maxAdd = current;
        }

        for (int i = k; i < nums.length; i++){ //k starts at the next number after adding indices of [k], then it'll go all the way to the end of the array
            current += nums[i] - nums[i - k]; //adds the next number after the intial k values added together, then subtract the first value to get a new max sum "a window slider"
            maxAdd = Math.max(current, maxAdd); //checks if the new sum is bigger than the OG sum
        }
        return maxAdd / k;
    }


    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}

