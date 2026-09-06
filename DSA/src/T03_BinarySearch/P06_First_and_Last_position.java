package T03_BinarySearch;

import java.util.Arrays;

public class P06_First_and_Last_position {

    public static int[] searchRange(int[] arr, int x) {
        if (arr == null || arr.length == 0) return new int[] {-1, -1};

        int first = findFirst(arr, x);
        if (first == -1) return new int[] {-1, -1};

        int last = findLast(arr, x);
        return new int[] {first, last};
    }

    public static int findFirst(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                first = mid;
                right = mid - 1; // keep searching left
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    public static int findLast(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                last = mid;
                left = mid + 1; // keep searching right
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    static void main() {
        int[] arr = {};
        System.out.print(Arrays.toString(searchRange(arr, 0)));
    }
}
