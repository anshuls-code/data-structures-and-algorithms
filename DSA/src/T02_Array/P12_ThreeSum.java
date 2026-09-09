package T02_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12_ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int low = i + 1, high = arr.length - 1;

            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    low++;
                    high--;

                    // Skip duplicates for second and third numbers
                    while (low < high && arr[low] == arr[low - 1]) low++;
                    while (low < high && arr[high] == arr[high + 1]) high--;

                }
                else if (sum > 0) high--;
                else low++;
            }
        }
        return res;
    }

     static void main() {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.print(threeSum(arr)); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}