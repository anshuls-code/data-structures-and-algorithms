package D02.T01_BasicMath;

public class P02_OddDigitsCount {

    public static int oddDigitsCount(int n) {
        int temp = n;
        if (temp < 0) temp *= -1;

        int oddCount = 0;
        while (temp > 0) {
            int dig = temp % 10;
            if (dig % 2 != 0) oddCount++;
            temp/=10;
        }
        return oddCount;
    }

    static void main() {
        System.out.print(oddDigitsCount(1234567));
    }
}
