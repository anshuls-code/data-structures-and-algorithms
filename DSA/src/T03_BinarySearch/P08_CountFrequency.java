package T03_BinarySearch;

public class P08_CountFrequency {

    public static int countFrequency(int[] arr, int x) {
        int first = P06_First_and_Last_position.findFirst(arr, x);
        int last = P06_First_and_Last_position.findLast(arr, x);

        if (first == -1) return 0;
        return last-first+1;
    }

    static void main() {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        System.out.print(countFrequency(arr, 5));
    }
}
