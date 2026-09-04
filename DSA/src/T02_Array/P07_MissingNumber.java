package T02_Array;

public class P07_MissingNumber {

    public static int missingNumber(int[] arr) {
        int expectedSum = ((arr.length+1) * (arr.length+2))/2;
        int actualSum = 0;
        for (int i : arr) actualSum += i;
        return expectedSum-actualSum;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,7};
        System.out.print(missingNumber(arr));
    }
}
