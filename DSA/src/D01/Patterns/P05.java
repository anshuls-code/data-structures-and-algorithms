package D01.Patterns;

/*
    1
    22
    333
    4444
    55555
*/

public class P05 {

    public static void pattern_05(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_05(5);
    }
}
