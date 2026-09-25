package D01.T01_Patterns;

/*
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *
*/

public class P20 {
    public static void pattern_20(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) System.out.print("*");
            for (int s=0; s<n*2-((i+1)*2); s++) System.out.print(" ");
            for (int j=0; j<=i; j++) System.out.print("*");
            System.out.println();
        }

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) System.out.print("*");
            for (int s=0; s<i*2+2; s++) System.out.print(" ");
            for (int j=0; j<n-i-1; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void main() {
        pattern_20(5);
    }
}
