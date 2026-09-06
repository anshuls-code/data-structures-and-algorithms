package T03_BinarySearch;

public class P04_SearchInsertPosition {

    public static int searchInsert(int[] arr, int x) {
        int res = arr.length;
        int left = 0, right = arr.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= x) {
                res = mid;
                right = mid-1;
            } else left = mid+1;
        }
        return res;
    }

    static void main() {
        int[] arr = {1, 3, 5, 6};
        System.out.print(searchInsert(arr, 5));
        System.out.print(searchInsert(arr, 2));
        System.out.print(searchInsert(arr, 7));
    }
}
