package T02_Array;

import java.util.Arrays;

public class P05_MoveZerosToEnd {

    public static void moveZeroes(int[] arr) {
        int k=0; int i=0;

        // Step-1: filling first 'K' elements with non-zeros
        while (i < arr.length) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
            i++;
        }

        // Step-2: filling values after non-zeros with zeros
        while (k < arr.length) {
            arr[k] = 0;
            k++;
        }
    }

    static void main() {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.print("Before: " + Arrays.toString(arr));

        System.out.println();

        moveZeroes(arr);
        System.out.print("After: " + Arrays.toString(arr));
    }
}
