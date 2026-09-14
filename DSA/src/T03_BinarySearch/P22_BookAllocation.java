package T03_BinarySearch;

public class P22_BookAllocation {

    public static int findPages(int[] arr, int students) {
        if (students > arr.length) return -1;

        int res = 0;
        int maxVal = arr[0];
        for (int i : arr) if (i > maxVal) maxVal = i;

        int sumVal = 0;
        for (int i : arr) sumVal += i;

        int low = maxVal;
        int high = sumVal;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(arr, students, mid)) {
                res = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return res;
    }

    public static boolean isValid(int[] arr, int students, int maxPages) {
        int currPages = 0;
        int studentCount = 1;

        for (int book : arr) {
            if (currPages + book > maxPages) {
                studentCount++;
                currPages = book;
                if (studentCount > students) return false;
            } else currPages += book;
        }
        return true;
    }

    static void main() {
        int[] arr = {12, 34, 67, 90};
        System.out.print(findPages(arr, 2));
    }
}
