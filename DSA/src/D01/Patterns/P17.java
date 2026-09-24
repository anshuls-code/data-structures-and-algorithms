package D01.Patterns;

/*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
*/

public class P17 {
    public static void pattern_17(int n) {
        for (int i=1; i<=n; i++) {
            for (int s=i; s<n; s++) {
                System.out.print(" ");
            }

            for (int j=0; j<i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j=i-2; j>=0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_17(5);
    }
}
