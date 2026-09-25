package D02.T01_BasicMath;

public class P09_PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i=3; i*i<=n; i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void main() {
        System.out.print(isPrime(61));
    }
}
