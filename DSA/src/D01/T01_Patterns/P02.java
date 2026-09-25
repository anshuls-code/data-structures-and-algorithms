package D01.T01_Patterns;

/*
    *
    **
    ***
    ****
    *****
*/

public class P02 {

    public static void pattern_02(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_02(5);
    }
}
