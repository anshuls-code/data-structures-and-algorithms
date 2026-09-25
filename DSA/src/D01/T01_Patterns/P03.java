package D01.T01_Patterns;

/*
    *****
    ****
    ***
    **
    *
*/

public class P03 {
    public static void pattern_03(int n) {
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_03(5);
    }
}
