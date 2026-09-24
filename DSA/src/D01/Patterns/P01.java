package D01.Patterns;

/*
    ****
    ****
    ****
    ****
*/
public class P01 {

    public static void pattern_01(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        pattern_01(4);
    }
}
