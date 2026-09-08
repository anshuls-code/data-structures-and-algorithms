package T03_BinarySearch;

public class P11_CountRotation {

    public static int count(int[] arr) {
        return minIdx(arr);
    }

    public static int minIdx(int[] arr) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid+1;
            } else if (arr[mid] == arr[right]) right--;
            else right = mid;
        }
        return left;
    }

    static void main() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int[] arr2 = {3};
        System.out.print(count(arr));
        System.out.print(count(arr2));
    }
}
