public class leetcode4 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerPlacement = n;
        int length = flowerbed.length;

        if (flowerbed[0] == 0 && flowerbed.length == 1){ //if flowerbed length is 1 and is empty
            return true;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed.length == 2){ //for if flowerbed is only 2 spaces big
            flowerPlacement = flowerPlacement - 1;
            return flowerPlacement == 0;
        }

        if (flowerbed.length > 2) {

            if (flowerbed[0] == 0 && flowerbed[1] == 0 && (flowerbed[2] == 1 || flowerbed[2] == 0)){
                flowerbed[0] = 1;
                flowerPlacement = flowerPlacement - 1;
                System.out.println(flowerPlacement);
            }

            for (int x = 0; x < flowerbed.length - 3; x++) {

                if (flowerbed[x] == 1 && flowerbed[x + 1] == 0 && flowerbed[x + 2] == 0 && flowerbed[x + 3] == 0) {
                    flowerbed[x + 2] = 1;
                    flowerPlacement = flowerPlacement - 1;
                }
            }

            if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0 && flowerbed[length - 3] == 1) { //accounts for the end of the flowerbed
                flowerbed[flowerbed.length - 1] = 1;
                flowerPlacement = flowerPlacement - 1;
                System.out.println(flowerPlacement);
            }
        }
        return flowerPlacement <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,1,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,1,0,0,0};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}

