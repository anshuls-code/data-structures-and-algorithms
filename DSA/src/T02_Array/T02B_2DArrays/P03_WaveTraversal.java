package T02_Array.T02B_2DArrays;

import java.util.Arrays;

public class P03_WaveTraversal {

    public static void waveTraversal(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        int[][] res = new int[r][c];

        for (int j = 0; j < c; j++) { // cols are always increasing
            if (j % 2 == 0) { // even cols -> rows increasing
                for (int i=0; i<r; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            else { // odd cols -> rows decreasing
                for (int i=r-1; i>=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    static void main() {
        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};
        waveTraversal(arr);
    }
}
