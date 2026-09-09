package T02_Array;

import java.util.Arrays;

public class P13_SortColors {

    public static void sortColors_I(int[] arr) {
        int zero = 0, one = 0, two = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) zero++;
            else if (arr[i] == 1) one++;
            else if (arr[i] == 2) two++;
            i++;
        }

        i=0;

        while (zero > 0) {
            arr[i++] = 0;
            zero--;
        }

        while (one > 0) {
            arr[i++] = 1;
            one--;
        }

        while (two > 0) {
            arr[i++] = 2;
            two--;
        }
    }

    public static void sortColors_II(int[] arr) {
        int low=0, mid=0, high=arr.length-1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) mid++;
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors_II(arr);
        System.out.print(Arrays.toString(arr));
    }
}
