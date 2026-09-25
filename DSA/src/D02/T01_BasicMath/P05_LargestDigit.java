package D02.T01_BasicMath;

public class P05_LargestDigit {

    public static int largestDigit(int n) {
        int temp = n;
        if (temp < 0) temp *= -1;

        int lg = Integer.MIN_VALUE;
        while (temp > 0) {
            int dig = temp % 10;
            if (dig > lg) lg = dig;
            temp /= 10;
        }
        return lg;
    }

    static void main() {
        System.out.print(largestDigit(1234543672));
    }
}
