package T02_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P11_TwoSum {

    // when array is not sorted
    public static int[] twoSum_I(int[] arr, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int toFind = x-arr[i];
            if (map.containsKey(toFind)) return new int[] {map.get(toFind), i};
            else map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    // when array is sorted
    public static int[] twoSum_II(int[] arr, int x) {
        int low=0, high=arr.length-1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == x) return new int[] {low, high};
            else if (sum > x) high--;
            else low++;
        }
        return new int[] {-1, -1};
    }

    static void main() {
        int[] arr = {3, 2, 4};
        System.out.print(Arrays.toString(twoSum_I(arr, 7)));
    }
}
