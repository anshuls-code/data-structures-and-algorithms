package D02.T01_BasicMath;

public class P06_Factorial {

    public static int fact(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;

        int i = 1, res = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }

    static void main() {
        System.out.print(fact(7));
    }
}
