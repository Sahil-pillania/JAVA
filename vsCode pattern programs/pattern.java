//import java.util.*;

class pattern {
    public static void main(String arg[]) {
        int n = 4; // rows
        int m = 5; // no of stars in every row

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}

// Output :

// *****
// *****
// *****
// *****
