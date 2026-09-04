package T02_Array;

public class P08_MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxConsecutive = 0;
        int consecutive = 0;
        for (int i : arr) {
            if (i == 1) consecutive++;
            else {
                maxConsecutive = Math.max(maxConsecutive, consecutive);
                consecutive = 0;
            }
        }
        return Math.max(consecutive, maxConsecutive);
    }

    static void main() {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.print(findMaxConsecutiveOnes(arr));
    }
}
