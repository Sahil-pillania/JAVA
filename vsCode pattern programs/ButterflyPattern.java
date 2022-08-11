class ButterflyPattern {
    public static void main(String args[]) {
        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {

            // left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(' ');
            }
            // right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {

            // left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(' ');
            }
            // right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
// Output:

// * *
// ** **
// *** ***
// **** ****
// **********
// **********
// **** ****
// *** ***
// ** **
// * *