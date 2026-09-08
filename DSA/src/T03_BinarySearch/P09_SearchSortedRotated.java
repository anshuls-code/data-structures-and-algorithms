package T03_BinarySearch;

public class P09_SearchSortedRotated {

    public static int search_I(int[] arr, int x) {
        int left = 0, right = arr.length-1;

        while (left <= right) {

            int mid = (left+right)/2;

            if (arr[mid] == x) return mid;

            // if left part is sorted
            else if (arr[left] <= arr[mid]) {

                // if x lies in sorted left part
                if (x >= arr[left] && x < arr[mid]) right = mid-1;

                // else search in the right half
                else left = mid+1;
            }

            // if right part is sorted
            else {

                // if x lies in sorted right part
                if (x > arr[mid] && x <= arr[right]) {
                    left = mid+1;
                }

                // else search in left part
                else right = mid-1;
            }
        }
        return -1;
    }

    public static int search_II(int[] arr, int x) {
        int left = 0, right = arr.length-1;

        while (left <= right) {

            int mid = (left+right)/2;
            if (arr[mid] == x) return mid;

            // Ambiguous case: shrink search window from both ends safely
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            }

            // if left part is sorted
            else if (arr[left] <= arr[mid]) {
                if (arr[left] <= x && x < arr[mid]) right = mid-1;
                else left = mid+1;
            }

            // if right part is sorted
            else {
                if (x > arr[mid] && x <= arr[right]) left = mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int x=0;
        // System.out.print(search_I(arr, x));

        int[] arr2 = {3, 1, 2, 3, 3, 3, 3};
        int y=1;
        System.out.print(search_II(arr2, y));
    }
}
