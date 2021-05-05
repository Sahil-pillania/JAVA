package com.company;

public class Recursion {
    static int factorial(int n){
        //factorial(n) = n * n-1 * n-2........1
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }

    }

    // factorial iterative method
    static int factorial_iterative(int n){
        //factorial(n) = n * n-1 * n-2........1
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product *=i;
            }
            return product;

        }

    }
    public static void main(String[] args) {
        int y= 7;
        System.out.println("The value of factorial n is: " + factorial(y));
        System.out.println("The value of factorial_iterative n is: " + factorial_iterative(y));

    }
}
