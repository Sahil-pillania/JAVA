public class HalfPyramid {
    public static void main(String arg[]) {
        int n = 5; // rows

        // outer
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

// Output:

// *
// **
// ***
// ****
// *****