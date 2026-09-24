package D01.Patterns;
/*
        *
       ***
      *****
     *******
    *********
*/

public class P07 {

    public static void pattern_07(int n) {
        for (int i=1; i<=n; i++) {
            for (int s=i; s<n; s++) {
                System.out.print(" ");
            }

            for (int j=0; j<i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_07(5);
    }
}
