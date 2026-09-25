package D01.T01_Patterns;

/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
*/

public class P13 {

    public static void pattern_13(int n) {
        int count=1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_13(5);
    }
}
