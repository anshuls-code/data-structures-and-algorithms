package T02_Array;

public class P10_LongestSubarraySum {

    public static int longestSubarraySum_I(int[] arr, int k) {
        int i=0, j=0;
        int sum = 0;
        int longestSubarray = 0;

        while (j < arr.length) {
            sum += arr[j];

            while (sum > k) {
                sum -= arr[i];
                i++;
            }

            if (sum == k){
                int subarrayLength = j-i+1;
                longestSubarray = Math.max(longestSubarray, subarrayLength);
            }
            j++;
        }
        return longestSubarray;
    }

    static void main() {
        int[] arrPos = {10, 5, 2, 7, 1, 9, 1, 1, 1, 1, 1};
        System.out.print(longestSubarraySum_I(arrPos, 15));
    }
}
