package T03_BinarySearch;

public class P24_PainterPartition {

    public static int findArea(int[] arr, int k) { // arr represents the blackboards, and k represents the no. of workers
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

    public static boolean isValid(int[] arr, int k, int maxTime) {
        int currTime = 0;
        int workerCount = 1;

        for (int i : arr) {
            if (currTime + i > maxTime) {
                workerCount++;
                currTime = i;
                if (workerCount > k) return false;
            } else currTime += i;
        }
        return true;
    }

    static void main() {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        System.out.print(findArea(arr, k));
    }
}
