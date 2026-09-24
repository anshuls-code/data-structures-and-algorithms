package D01.Patterns;

/*
        A B C D E
        A B C D
        A B C
        A B
        A
*/

public class P15 {
    public static void pattern_15(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print( (char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_15(5);
    }
}
