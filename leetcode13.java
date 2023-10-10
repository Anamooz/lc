import java.util.Arrays;

public class leetcode13 {
    public static int maxOperations(int[] nums, int k) {

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        Arrays.sort(nums); //sort the array from lowest to highest

        System.out.println(Arrays.toString(nums));

        while (left < right){

            if (nums[left] + nums[right] == k){ //if the far left + far right = k, add to the counter
                count++;
                left++; //increment left side
                right--; //increment right side, to find more possible sums that add to k
            } else if (nums[left] + nums[right] < k){ //if the numbers added together is less than k, that means the left side is the limiting factor so increment
                left++;
            } else {
                right--; //vice versa over here, except you can just deincrement the right side
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 6;

        System.out.println(maxOperations(nums, k));
    }
}

