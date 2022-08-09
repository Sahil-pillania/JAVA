public class HalfPyramindWithNumbers {
    public static void main(String arg[]) {
        int n = 5; // rows

        // outer
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

// Output:

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
