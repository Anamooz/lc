public class leetcode17 {
    public static int longestSubarray(int[] nums) {
        int i = 0;
        int currentCount = 0;
        int previousCount = 0;
        int sum = 0;

        while (i < nums.length){
            if (nums[i] == 1){
                currentCount++;
            }

            sum = Math.max(sum, currentCount + previousCount);

            if (nums[i] == 0){
                previousCount = currentCount;
                currentCount = 0;
            }

            i++;
        }
        if (sum == nums.length){
            return sum - 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};

        System.out.println(longestSubarray(nums));

    }
}