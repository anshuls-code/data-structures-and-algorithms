package T03_BinarySearch;

public class P23_SplitArrayLargestSum {

    public static int splitArray(int[] arr, int k) {
        if (k > arr.length) return -1;

        int res = 0;
        int maxVal = arr[0];
        for (int i : arr) if (i > maxVal) maxVal = i;

        int sumVal = 0;
        for (int i : arr) sumVal += i;

        int low = maxVal;
        int high = sumVal;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (isValid(arr, k, mid)) {
                res = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return res;
    }

    public static boolean isValid(int[] arr, int k, int maxSum) {
        int currentSum = 0;
        int countSubarray = 1;

        for (int i : arr) {
            if (currentSum + i > maxSum) {
                countSubarray++;
                currentSum = i;
                if (countSubarray > k) return false;
            } else currentSum += i;
        }
        return true;
    }

    static void main() {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.print(splitArray(arr, k));
    }
}
