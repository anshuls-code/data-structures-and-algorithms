package D01.Patterns;

/*
        1        1
        12      21
        123    321
        1234  4321
        1234554321
*/

public class P12 {

    public static void pattern_12(int n) {
        for (int i=1; i<=n; i++) {
            int j=1;
            for (; j<=i; j++) System.out.print(j);
            for (int s=1; s<=n*2-i*2; s++) System.out.print(" ");
            for (--j;j>=1; j--) System.out.print(j);
            System.out.println();
        }
    }

    static void main() {
        pattern_12(5);
    }
}
