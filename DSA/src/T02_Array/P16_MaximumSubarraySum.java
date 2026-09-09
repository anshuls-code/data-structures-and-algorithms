package T02_Array;

import java.util.Arrays;

public class P16_MaximumSubarraySum {

    // Brute force approach --> generating all subarrays -> find the sum of each --> find maximum sum
    public static int maxSubarraySum_I(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j=i; j<arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Optimal approach --> Kadane's algorithm --> add a[i] to sum --> update maxSum --> If sum < 0, reset sum = 0
    // because a negative prefix will never help build a maximum sum in the future.
    public static int maxSubarraySum_II(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : arr) {
            sum += i;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }

    // Print the range of maxSubarraySum
    public static int[] maxSubarraySum_III(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                tempStart = i+1;
            }
        }
        System.out.print("Maximum Sub-array sum: " + maxSum);
        System.out.println();
        System.out.print("Indexes: ");
        return new int[] {start, end};
    }

    static void main() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print(Arrays.toString(maxSubarraySum_III(arr)));
    }
}