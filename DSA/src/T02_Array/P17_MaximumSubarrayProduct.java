package T02_Array;

public class P17_MaximumSubarrayProduct {

    public static long maxSubarrayProduct(int[] arr) {
        long maxProd = arr[0];
        long minProd = arr[0];
        long result = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] < 0) {
                long temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i], maxProd*arr[i]);
            minProd = Math.min(arr[i], minProd*arr[i]);

            result = Math.max(result, maxProd);
        }
        return result;
    }

    static void main() {
        int[] arr = {2, 3, -2, 4};
        System.out.print(maxSubarrayProduct(arr));
    }
}
