package D02.T01_BasicMath;

public class P04_PalindromeNumber {

    public static boolean isPalindrome(int n) {
        return n == P03_NumberReverse.reverseNum(n);
    }

    static void main() {
        System.out.print(isPalindrome(12321));
    }
}
