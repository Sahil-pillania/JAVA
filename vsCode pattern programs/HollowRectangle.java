//import java.util.*;

class HollowRectangle {
    public static void main(String arg[]) {
        int n = 4; // rows
        int m = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print('\n');
        }
    }
}

// Output :

// *****
// * *
// * *
// *****