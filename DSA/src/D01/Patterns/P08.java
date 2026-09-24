package D01.Patterns;

/*
    *********
     *******
      *****
       ***
        *
 */
public class P08 {

    public static void pattern_08(int n) {
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
        pattern_08(5);
    }
}
