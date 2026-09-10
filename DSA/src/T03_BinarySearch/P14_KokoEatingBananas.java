package T03_BinarySearch;

public class P14_KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int maxVal = piles[0];
        int minSpeed = 0;
        for (int i : piles) if (i > maxVal) maxVal = i;

        int low = 1, high = maxVal;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isValid(piles, mid, h)) {
                minSpeed = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return minSpeed;
    }

    public static boolean isValid(int[] piles, int k, int h) {
        long totalHours = 0;

        for (int i : piles) {
            totalHours += (i + k - 1) / k;
        }

        return totalHours <= h;
    }

    static void main() {
        int[] piles = {3, 6, 7, 11};
        System.out.print(minEatingSpeed(piles, 8));
    }
}
