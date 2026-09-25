package D01.T01_Patterns;

/*
            *
           ***
          *****
         *******
        *********
        *********
         *******
          *****
           ***
            *
 */

public class P09 {

    public static void pattern_09(int n) {
        for (int i=1; i<=n; i++) {
            for (int s=i; s<n; s++) {
                System.out.print(" ");
            }

            for (int j=0; j<i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<n; i++) {
            for (int s=0; s<i; s++) {
                System.out.print(" ");
            }

            for (int j=0; j<n*2-i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_09(5);
    }
}
