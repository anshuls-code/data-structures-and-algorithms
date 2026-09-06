package T03_BinarySearch;

public class P05_Floor_and_Ceil {

    // Largest element in the array which is either less or equals to x
    public static int floor(int[] arr, int x) {
        int res = arr.length;
        int left = 0, right = arr.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= x) {
                res = mid;
                left = mid+1;
            } else right = mid-1;
        }
        return arr[res];
    }

    // Smallest element in the array which is either greater or equals to x - LB(x)
    public static int ceil(int[] arr, int x) {
        return arr[P02_LowerBound.lowerBound(arr, x)];
    }

    static void main() {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.print("Floor: " + floor(arr, 5) + " Ceil: " + ceil(arr, 5));
    }
}
