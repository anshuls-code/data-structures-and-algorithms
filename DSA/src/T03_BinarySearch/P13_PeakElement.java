package T03_BinarySearch;

public class P13_PeakElement {

    public static int peak(int[] arr) {
        int left=0, right=arr.length-1;
        while (left < right) {
            int mid = (left+right)/2;
            if (arr[mid+1] > arr[mid]) left = mid+1;
            else right=mid;
        }
        return arr[left];
    }

    static void main() {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.print(peak(arr));
    }
}
