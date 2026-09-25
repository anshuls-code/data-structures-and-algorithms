package D01.T01_Patterns;

/*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
 */

public class P11 {
    public static void pattern_11(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_11(5);
    }
}
