package D01.T01_Patterns;

/*
    1
    12
    123
    1234
    12345
*/
public class P04 {

    public static void pattern_04(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_04(5);
    }
}
