package com.company;

public class Program15 {
    public static void main(String[] args) {
        // Creating a java program to add two matrices of size 2x3.
        int [][] mat1 = { {1, 2, 3},
                          {4, 5, 6}};
        int [][] mat2 = { {2, 6, 9},
                          {5, 8, 9}};
        int [][] result = { {0, 0, 0},
                            {0, 0, 0}};

        for (int i=0; i<mat1.length; i++){              // row number of times
            for (int j=0; j<mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);// column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        for (int i=0; i<mat1.length; i++){              // row number of times
            for (int j=0; j<mat1[i].length; j++) {
                System.out.print(result[i][j] +" ");// column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");  // just print a new line
        }
    }
}
