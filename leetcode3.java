import java.util.ArrayList;
import java.util.List;

public class leetcode3 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];

        for (int compare : candies){ //for each loop
            maxCandies = Math.max(compare, maxCandies); //finding the biggest number so when we add candies w/ extra candies to see if its bigger than or less than the biggest number
        }

        List<Boolean> result = new ArrayList<>();

        for (int x = 0; x < candies.length; x++){
            result.add(candies[x] + extraCandies >= maxCandies); //adds all the array numbers with extra candies and compares it with the biggest number, if greater than or equal to return true else false
        }

        return result; //default boolean is false
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}

