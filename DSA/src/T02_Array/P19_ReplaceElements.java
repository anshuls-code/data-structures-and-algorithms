package T02_Array;

import java.util.Arrays;

public class P19_ReplaceElements {

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else arr[i] = max;
        }
        return arr;
    }

    static void main() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.print(Arrays.toString(replaceElements(arr)));
    }
}
