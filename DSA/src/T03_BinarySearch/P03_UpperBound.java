package T03_BinarySearch;

public class P03_UpperBound {

    // Upper Bound of x is the SMALLEST index such that the value of that index is strictly greater than x.
    // UB(x) -> smallest idx where, arr[idx] > x
    public static int upperBound(int[] arr, int x) {
        int res = arr.length;
        int left = 0, right = arr.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > x) {
                res = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return res;
    }

    static void main() {
        int[] arr = {3, 5, 7, 8, 15, 19, 20, 22};
        System.out.print(upperBound(arr, 30));
    }
}
