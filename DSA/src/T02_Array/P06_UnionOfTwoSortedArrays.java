package T02_Array;

import java.util.ArrayList;

public class P06_UnionOfTwoSortedArrays {

    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> li = new ArrayList<>();
        int i=0; // for tracking elements of 'a[]'
        int j=0; // for tracking elements of 'b[]'

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) { // when a[i] < b[j] -> if either the list should not empty or should not contain a[i], then only add a[i] in list and increment only 'i'
                if (li.isEmpty() || li.getLast() != a[i]) li.add(a[i]);
                i++;
            }
            else if (b[j] < a[i]) { // when b[j] < a[i] -> if either the list should not empty or should not contain b[j], then only add b[j] in list and increment only 'j'
                if (li.isEmpty() || li.getLast() != b[j]) li.add(b[j]);
                j++;
            } else { // when both values are same, check if either the list should not empty or should not contain either of a[i] or b[j], then only add either of a[i] or b[j] in list and increment both 'i' and 'j'
                if (li.isEmpty() || li.getLast() != a[i]) li.add(a[i]);
                i++;
                j++;
            }
        }

        // remaining elements of a[]
        while (i < a.length) {
            if (li.isEmpty() || li.getLast() != a[i]) li.add(a[i]);
            i++;
        }

        // remaining elements of b[]
        while (j < b.length) {
            if (li.isEmpty() || li.getLast() != b[j]) li.add(b[j]);
            j++;
        }

        return li;
    }

    static void main() {
        int[] a = {1,2,3,4,5,5,5,6,7,8};
        int[] b = {4,5,6,7,7,8,9,10};
        System.out.print(union(a, b));
    }
}
