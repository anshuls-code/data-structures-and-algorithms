package D01.T01_Patterns;

/*
        A
        B B
        C C C
        D D D D
        E E E E E
*/

public class P16 {
    public static void pattern_16(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print( (char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_16(5);
    }
}
