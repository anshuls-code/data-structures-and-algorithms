package D01.Patterns;

/*
        A
        A B
        A B C
        A B C D
        A B C D E
*/

public class P14 {
    public static void pattern_14(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print( (char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_14(5);
    }
}
