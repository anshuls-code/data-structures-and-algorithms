package D01.Patterns;

/*
        ********
        ***  ***
        **    **
        *      *
        *      *
        **    **
        ***  ***
        ********
*/

public class P19 {
    public static void pattern_19(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) System.out.print("*");
            for (int s=0; s<i*2; s++) System.out.print(" ");
            for (int j=0; j<n-i; j++) System.out.print("*");

            System.out.println();
        }

        for (int i=0; i<n; i++)  {
            for (int j=0; j<=i; j++) System.out.print("*");
            for (int s=0; s<=n-i*2+1; s++) System.out.print(" ");
            for (int j=0; j<=i; j++) System.out.print("*");

            System.out.println();
        }
    }

    static void main() {
        pattern_19(4);
    }
}
