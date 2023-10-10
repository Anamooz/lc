import java.util.Arrays;

public class leetcode7 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) { //second to first to last index going forwards to exclude first index
            pre[i] = pre[i - 1] * nums[i - 1]; //multiplying every number before index i (starts at second to first) together. Initial value is always one for pre[i-1] to include the exluded index at 0.
            System.out.println("pre[" + i + "] is : " + pre[i] + ", pre[i - 1] is: " + pre[i - 1] + ", nums[i - 1] :" + nums[i - 1]);
        }
        for(int i = n - 2; i >= 0; i--) { //second to last index to beginning going backwards to exclude last index
            suff[i] = suff[i + 1] * nums[i + 1]; //multiplying ever number after index i (starts at second to last) together. Initial value is always one for suff[i-1] to include the exluded index at nums.length
            System.out.println("suff[" + i + "] is : " + suff[i] + ", suff[i + 1] is: " + suff[i + 1] + ", nums[i - 1] :" + nums[i + 1]);
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i]; //contains product of every element before i and every element after i but not the element at index i
            System.out.println("pre[" + i + "] is : " + pre[i] + ", suff[" + i + "] is : " + suff[i] + ", ans[" + i + "] is " + ans[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
}

