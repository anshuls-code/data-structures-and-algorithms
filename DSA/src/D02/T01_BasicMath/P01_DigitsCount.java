package D02.T01_BasicMath;

public class P01_DigitsCount {
    public static int digitsCount(int n) {
        int temp = n;
        if (temp < 0) temp *= -1;

        int count = 0;
        while (temp > 0) {
            temp/=10;
            count++;
        }
        return count;
    }

    static void main() {
        System.out.print(digitsCount(12345));
    }
}
