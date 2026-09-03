package T02_Array;

public class P03_RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int k=0, i=1;
        while (i < arr.length) {
            if (arr[i] != arr[k]) {
                k++;
                arr[k] = arr[i];
            }
            i++;
        }
        return k+1;
    }

    static void main() {
        int[] arr = {1,1,2};
        int k = removeDuplicates(arr);
        System.out.println(k);
    }
}
