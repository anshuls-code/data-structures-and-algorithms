package T02_Array;

public class P09_SingleNumber {
    public static int singleNumber(int[] arr) {
        int x = 0;
        for (int i : arr) {
            x = x^i;
        }
        return x;
    }

    static void main() {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.print(singleNumber(arr));
    }
}
