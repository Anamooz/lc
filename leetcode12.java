public class leetcode12 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int currentArea;

        while (left < right) { //makes sure the two pointers dont overlap
            currentArea = Math.min(height[left], height[right]) * (right - left); //gets the lowest height and multiplies it bc the base giving the current maximum area
            maxArea = Math.max(maxArea, currentArea); //compares the highest area to keep track of the highest

            if (height[left] < height[right]) { //if the left side is smaller than the right side, the left side is restricting the possible max area so increase left indexes to check other possible areas
                left++;
            } else { //else the right side is restricting possible max area so we decrease right index to check other possible maximum areas
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}

