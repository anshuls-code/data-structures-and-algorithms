package D02.T01_BasicMath;

public class P08_PerfectNumber {

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i=1; i<n; i++) {
            if (n % i == 0) sum += i;
        }

        return sum == n;
    }

    static void main() {
        System.out.print(isPerfect(496));
    }
}
