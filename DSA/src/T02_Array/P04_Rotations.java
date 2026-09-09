package T02_Array;

import java.util.Arrays;

public class P04_Rotations {

    // 1. Left -> Anti-clock-wise rotation
    public static void rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;

        k %= arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - k);
        reverse(arr, arr.length - k, arr.length - 1);
    }

    // 2. Clock-wise rotation
    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;

        k %= arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateLeft(arr, 1);
        System.out.print(Arrays.toString(arr));
    }
}
