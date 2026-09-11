package T03_BinarySearch;

public class P17_SquareRoot {

    public static int squareRoot(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (mid*mid == n) return mid;
            else if (mid*mid > n) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    static void main() {
        System.out.print(squareRoot(1));
    }
}
