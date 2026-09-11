package T03_BinarySearch;

public class P18_SmallestDivisor {

    public static int smallestDivisor(int[] arr, int threshold) {
        int maxVal = 0;
        for (int i : arr) if (i > maxVal) maxVal = i;
        int low = 1, high = maxVal;
        int res = 0;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (isValid(arr, threshold, mid)) {
                res = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return res;
    }

    public static boolean isValid(int[] arr, int threshold, int divisor) {
        int sum = 0;
        for (int i : arr) {
            sum += (i + divisor - 1) / divisor;
            if (sum > threshold) return false; // Stop early, no need to sum the rest
        }
        return sum <= threshold;
    }

    static void main() {
        int[] arr = {44,22,33,11,1};
        System.out.print(smallestDivisor(arr, 5));
    }
}
