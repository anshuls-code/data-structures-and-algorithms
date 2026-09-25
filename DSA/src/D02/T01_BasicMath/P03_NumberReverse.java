package D02.T01_BasicMath;

public class P03_NumberReverse {

    public static int reverseNum(int n) {
        int temp = n;
        if (temp < 0) temp *= -1;

        int reversed = 0;

        while (temp > 0) {
            int dig = temp % 10;
            reversed = reversed * 10 + dig;
            temp /= 10;
        }
        return n >= 0 ? reversed : -reversed;
    }

    static void main() {
        System.out.print(reverseNum(12345));
    }
}
