package T03_BinarySearch;

public class P12_SingleElement {

    public static int singleElement(int[] arr) {
        int left=0, right=arr.length-2;
        while (left <= right) {
            int mid = (left+right)/2;

            // mid ^ 1 checks --> arr[mid+1] if mid is even, or arr[mid-1] if mid is odd
            if (arr[mid] == arr[mid ^ 1]) left = mid + 1;
            else right = mid - 1;
        }
        return arr[left];
    }

    static void main() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        System.out.print(singleElement(arr));
    }
}
