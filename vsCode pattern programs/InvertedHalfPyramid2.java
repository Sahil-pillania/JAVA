public class InvertedHalfPyramid2 {
    public static void main(String arg[]) {

        int n = 4; // no. of rows

        // outer
        for (int i = 1; i <= n; i++) {

            // inner
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// Output:

// *
// **
// ***
// ****
