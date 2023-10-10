public class leetcode8 {
    public static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        if (nums.length < 3){
            return false;
        }
        for (int x = 0; x < nums.length; x++){
            if (nums[x] <= i){
                i = nums[x];
            }
            else if (nums[x] <= j){
                j = nums[x];
            } else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};

        System.out.println(increasingTriplet(nums));
    }
}

