package T02_Array;

public class P01_LargestElements {

    // 1. First Largest Element
    public static int largestElem(int[] arr) {
        int lg=arr[0];
        for (int i : arr) if (i > lg) lg = i;
        return lg;
    }

    // 2. Second Largest Element
    public static int secondLargestElem(int[] arr) {
        int lg=arr[0];
        int slg=Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > lg) {
                slg = lg;
                lg = i;
            }
            else if (i > slg && i < lg) slg = i;
        }
        return slg;
    }

    // 3. Third Largest Element
    public static int thirdLargestElem(int[] arr) {
        int lg=arr[0];
        int slg=Integer.MIN_VALUE;
        int tlg=Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > lg) {
                tlg = slg;
                slg = lg;
                lg = i;
            } else if (i > slg && i < lg) {
                tlg = slg;
                slg = i;
            } else if (i > tlg && i < slg) {
                tlg = i;
            }
        }
        return tlg;
    }

    static void main() {
        int[] arr = {1, 2, 4, 5, 8, 3, 7, 10, 9, 0};
        System.out.print("Largest: " + largestElem(arr) +
                "\nSecond Largest: " + secondLargestElem(arr) +
                "\nThird Largest: " + thirdLargestElem(arr));
    }
}
