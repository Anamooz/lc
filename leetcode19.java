public class leetcode19 {

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int x : nums){
            totalSum += x;
        }

        for (int i = 0; i < nums.length; i++){ //focuses on pivot number so it doesnt count towards left or right sum

            if (i != 0) { //adds the numbers before the pivot point = nums[i]
                leftSum += nums[i - 1];
            }

            if (totalSum - leftSum - nums[i] == leftSum) { //total - left sum - pivot number = right side total basically
                return i; //return index of pivot
            }
        }
        return -1; //else return -1
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}

