package T03_BinarySearch;

public class P21_FindKthPositive {

    public static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            int missing = arr[mid] - (mid+1);

            if (missing < k) low = mid+1;
            else high = mid-1;
        }
        return low+k;
    }

    static void main() {
        int[] arr = {1,2,3,4};
        System.out.print(findKthPositive(arr, 2));
    }
}
