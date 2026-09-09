package T02_Array;

import java.util.ArrayList;

public class P18_Leaders {

    public static ArrayList<Integer> leaders(int[] arr) {
        int max = arr[arr.length-1];
        ArrayList<Integer> li = new ArrayList<>();
        li.add(max);

        for (int i=arr.length-2; i>=0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                li.add(arr[i]);
            }
        }
        return li;
    }

    static void main() {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.print(leaders(arr));
    }
}
