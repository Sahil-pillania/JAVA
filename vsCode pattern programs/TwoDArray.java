import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // inputting the data
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // output of data
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Output:

// 2
// 2
// 1 2
// 3 4
// 1 2
// 3 4
