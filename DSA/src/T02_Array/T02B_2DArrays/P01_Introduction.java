package T02_Array.T02B_2DArrays;

import java.util.Scanner;

public class P01_Introduction {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        System.out.print("Enter Cols: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m]; // creating 2D array of size n and m

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print("Enter element " + i + "," + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
