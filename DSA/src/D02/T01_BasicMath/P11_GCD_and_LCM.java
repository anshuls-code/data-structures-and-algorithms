package D02.T01_BasicMath;

public class P11_GCD_and_LCM {

    public static int findGCD(int a, int b) {
        // Handle negative numbers by converting to absolute values
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;

        // Divide before multiplying to prevent integer overflow
        return Math.abs(a) / findGCD(a, b) * Math.abs(b);
    }

    static void main() {
        System.out.print(findGCD(225, 25));
        System.out.println();
        System.out.print(findLCM(225, 25));

    }

}
