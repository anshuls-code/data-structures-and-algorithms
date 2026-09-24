package D01.Patterns;

/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
 */

public class P10 {
    public static void pattern_10(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<n-1; i++) {
            for (int j=i; j<n-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_10(5);
    }
}
