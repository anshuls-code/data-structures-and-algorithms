package D02.T01_BasicMath;

public class P12_PrintDivisors {

    public static void printDivisors(int n) {
        for (int i=1; i<=n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    static void main() {
        printDivisors(36);
    }
}
