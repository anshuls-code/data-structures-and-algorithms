package T03_BinarySearch;

public class P15_MinimumDaysMBouquets {

    public static int minDays(int[] bloomDay, int m, int k) {
        // if (bloomDay.length < m * k) return -1;
        if ((long) m * k > bloomDay.length) return -1;

        int minDays = 0;

        int low = Integer.MAX_VALUE, high = 0;
        for (int i : bloomDay) {
            if (i > high) high = i;
            if (i < low) low = i;
        }

        while (low <= high) {
            int mid = (low + high)/2;
            if (isValid(bloomDay, m, k, mid)) {
                minDays = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return minDays;
    }

    /*
    public static boolean isValid(int[] bloomDay, int m, int k, int days) {
        int adjCount = 0;
        int totalBouquets = 0;

        for (int i : bloomDay) {
            if (days - i >= 0) { // means the flower is bloomed
                adjCount++;
            } else {
                totalBouquets += adjCount/k;
                adjCount = 0;
            }
        }
        totalBouquets += adjCount / k;
        return totalBouquets >= m;
    }
    */

    public static boolean isValid(int[] bloomDay, int m, int k, int days) {
        int adjCount = 0;
        int totalBouquets = 0;

        for (int bloom : bloomDay) {
            if (bloom <= days) {
                adjCount++;
                if (adjCount == k) {
                    totalBouquets++;
                    adjCount = 0;
                    if (totalBouquets == m) return true; // Early exit
                }
            } else {
                adjCount = 0;
            }
        }
        return totalBouquets >= m;
    }

    static void main() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3; // no. of bouquets to make
        int k = 1; // no. of adjacent flowers in each bouquet
        System.out.print(minDays(bloomDay, m, k));
    }
}
