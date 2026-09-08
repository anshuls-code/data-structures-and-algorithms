package T03_BinarySearch;

public class P10_FindMinimum {

    public static int findMin_I(int[] arr) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid+1;
            } else right = mid;
        }
        return arr[left];
    }

    public static int findMin_II(int[] arr) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid+1;
            } else if (arr[mid] == arr[right]) right--;
            else right = mid;
        }
        return arr[left];
    }

    static void main() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(findMin_I(arr));

        int[] arr2 = {3, 1, 3, 3, 3};
        System.out.print(findMin_II(arr2));
    }
}
