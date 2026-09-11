package T03_BinarySearch;

import java.util.Arrays;

public class P20_MagneticForce {

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = position[position.length-1] - position[0];
        int res = 1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (canPlace(position, m, mid)) {
                res = mid;
                low = mid+1;
            } else high = mid-1;
        }

        return res;
    }

    public static boolean canPlace(int[] pos, int m, int dist) {
        int lastPlacedPosition = 0;
        int count = 1;

        for (int i=1; i<pos.length; i++) {
            if (pos[i] - pos[lastPlacedPosition] >= dist) {
                count++;
                lastPlacedPosition = i;
                if (count >= m) return true;
            }
        }
        return false;
    }

    static void main() {
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        System.out.print(maxDistance(position, m));
    }
}
