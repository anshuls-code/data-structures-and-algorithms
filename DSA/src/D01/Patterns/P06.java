package D01.Patterns;

/*
    12345
    1234
    123
    12
    1
*/

public class P06 {

    public static void pattern_06(int n) {
        for (int i=0; i<n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_06(5);
    }
}
