package D01.T01_Patterns;

/*
        5 5 5 5 5 5 5 5 5
        5 4 4 4 4 4 4 4 5
        5 4 3 3 3 3 3 4 5
        5 4 3 2 2 2 3 4 5
        5 4 3 2 1 2 3 4 5
        5 4 3 2 2 2 3 4 5
        5 4 3 3 3 3 3 4 5
        5 4 4 4 4 4 4 4 5
        5 5 5 5 5 5 5 5 5
*/

public class P22 {
    public static void pattern_20(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) System.out.print(n-j + " ");
            for (int s=0; s<n*2-((i+1)*2); s++) System.out.print(n-i + " ");
            for (int j=n-i+1; j<=n; j++) System.out.print(j + " ");
            System.out.println();
        }

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) System.out.print(n-j + " ");
            for (int s=0; s<(i+1)*2; s++) System.out.print(i+2 + " ");
            for (int j=i+2; j<n; j++) System.out.print(j+1 + " ");
            System.out.println();
        }
    }

    static void main() {
        pattern_20(5);
    }
}
