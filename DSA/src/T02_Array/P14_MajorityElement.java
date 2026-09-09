package T02_Array;

import java.util.ArrayList;

public class P14_MajorityElement {

    // Occurrence > n/2
    public static int majorityElement_I(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        int i = 1;

        while (i < arr.length) {
            if (arr[i] == candidate) count++;
            else count--;

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }

            i++;
        }
        return candidate;
    }

    // Occurrence > n/3
    public static ArrayList<Integer> majorityElement_II(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int candidate_1 = 0; int count_1 = 0;
        int candidate_2 = 0; int count_2 = 0;

        for (int i : arr) {
            if (i == candidate_1) count_1++;
            else if (i == candidate_2) count_2++;
            else if (count_1 == 0) {
                candidate_1 = i;
                count_1 = 1;
            }
            else if (count_2 == 0) {
                candidate_2 = i;
                count_2 = 1;
            }
            else {
                count_1--; count_2--;
            }
        }

        // verification pass
        count_1 = 0;
        count_2 = 0;

        for (int i : arr) {
            if (i == candidate_1) count_1++;
            else if (i == candidate_2) count_2++;
        }

        if (count_1 > arr.length/3) li.add(candidate_1);
        if (count_2 > arr.length/3) li.add(candidate_2);

        return li;
    }

    static void main() {
        int[] arr = {3, 2, 3};
        System.out.print(majorityElement_I(arr));
    }
}
