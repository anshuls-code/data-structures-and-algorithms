package T02_Array.T02B_2DArrays;

import java.util.Arrays;

public class P02_MatrixMultiplication {

    // Rule: cols of arr1 should be equals to rows of arr2 for multiplication

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;

        int r2 = arr2.length;
        int c2 = arr2[0].length;

        if (c1 != r2) return new int[][] {{-1}, {-1}};

        int[][] res = new int[r1][c2];

        for (int i=0; i<res.length; i++) {
            for (int j=0; j<res[0].length; j++) {

                for (int k=0; k<c1; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return res;
    }

    static void main() {
        int[][] arr1 = {{10, 0, 0}, {0, 1, 20}};
        int[][] arr2 = {{10, 1, 1, 1}, {20, 1, 1, 1}, {3, 2, 0, 30}};

        System.out.print(Arrays.deepToString(multiplyMatrix(arr1, arr2)));
    }
}
