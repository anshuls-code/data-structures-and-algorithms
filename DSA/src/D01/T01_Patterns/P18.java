package D01.T01_Patterns;

/*
    E
    D E
    C D E
    B C D E
    A B C D E
*/

public class P18 {

    public static void pattern_18(int n) {
        for (int i=0; i<n; i++) {
            for (int j=n-i-1; j<n; j++) System.out.print((char) ('A' + (j)) + " ");
            System.out.println();
        }
    }

    static void main() {
        pattern_18(5);
    }
}
