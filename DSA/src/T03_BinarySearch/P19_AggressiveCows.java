package T03_BinarySearch;

import java.util.Arrays;

public class P19_AggressiveCows {

    public static int mxnDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int low = 1, high = stalls[stalls.length-1] - stalls[0];
        int res = 1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (canPlaceCows(stalls, cows, mid)) {
                res = mid;
                low = mid+1;
            } else high = mid-1;
        }
        return res;
    }

    public static boolean canPlaceCows(int[] stalls, int cows, int dist) {
        int lastPlacedPosition = 0; // placing first cow at 0th position
        int count = 1; // assumed one cow already placed at 0th position

        for (int i=1; i<stalls.length; i++) {
            if (stalls[i] - stalls[lastPlacedPosition] >= dist) {
                count++;
                lastPlacedPosition = i;
                if (count >= cows) return true;
            }
        }
        return false;
    }

    static void main() {
        int[] stalls = {0, 3, 4, 7, 10, 9}; // stalls position
        int k = 4; // no. of aggressive cows
        System.out.print(mxnDistance(stalls, k));
    }
}
