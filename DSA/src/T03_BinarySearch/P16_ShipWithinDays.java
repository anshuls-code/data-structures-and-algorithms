package T03_BinarySearch;

public class P16_ShipWithinDays {

    public static int shipWithinDays(int[] weights, int days) {
        int minDays = 0;

        int low = 0; // highest weight
        int high = 0; // sum of all weights
        for (int i : weights) {
            if (i > low) low = i;
            high += i;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(weights, days, mid)) {
                minDays = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return minDays;
    }

    public static boolean isValid(int[] weights, int days, int capacity) {
        int currWeight = 0;
        int requiredDays = 1;
        for (int weight : weights) {

            currWeight += weight;

            if (currWeight > capacity) {
                requiredDays++;
                currWeight = weight;
            }
        }
        return requiredDays <= days;
    }

    static void main() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(shipWithinDays(weights, 5));
    }
}
