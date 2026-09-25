package D02.T01_BasicMath;

public class P10_PrimeNumbersCount {

    public static void primeCount(int n) {
        int count = 0;
        int i=2;

        while (count < n) {
            if (P09_PrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    static void main() {
        primeCount(100);
    }
}
