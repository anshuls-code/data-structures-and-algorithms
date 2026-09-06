package T03_BinarySearch;

public class P01_BinarySearchAlgorithm {

    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print(binarySearch(arr, 3));
    }
}
