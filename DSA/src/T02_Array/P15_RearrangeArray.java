package T02_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class P15_RearrangeArray {

    // equal number of positive and negative numbers
    public static int[] rearrangeArray(int[] arr) {
        int pos = 0, neg = 1;
        int[] res = new int[arr.length];

        for (int i : arr) {
            if (i >= 0) {
                res[pos] = i;
                pos += 2;
            } else {
                res[neg] = i;
                neg += 2;
            }
        }
        return res;
    }

    // un-equal number of positive and negative numbers
    public static int[] rearrangeArray2(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i : arr) {
            if (i >= 0) pos.add(i);
            else neg.add(i);
        }

        int minLen = Math.min(pos.size(), neg.size());

        // Step 1: Interleave up to the smaller count
        for (int i = 0; i < minLen; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }

        // Step 2: Append remaining leftovers sequentially
        int index = 2 * minLen;
        if (pos.size() > neg.size()) {
            for (int i = minLen; i < pos.size(); i++) {
                arr[index++] = pos.get(i);
            }
        } else {
            for (int i = minLen; i < neg.size(); i++) {
                arr[index++] = neg.get(i);
            }
        }

        return arr;
    }

    static void main() {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.print(Arrays.toString(rearrangeArray(arr)));
    }
}
