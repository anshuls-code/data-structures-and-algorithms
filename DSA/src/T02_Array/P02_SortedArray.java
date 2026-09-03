package T02_Array;

public class P02_SortedArray {

    // 1. Check if array is sorted or not
    public static boolean isSorted(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] > arr[i]) return false;
        }
        return true;
    }

    // 2. Check if array is both sorted and rotated


    static void main() {
        int[] arr = {1, 2, 3, 5, 4, 6, 7, 8};
        System.out.println(isSorted(arr));
    }
}
