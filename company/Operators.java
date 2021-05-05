package com.company;
// Some operators -->
public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        // Addition
        int a = 6;
        int b = 10 +a;
        System.out.println("Sum of a and b is " +b);

        // Multiplication
        int c = 6;
        int d = 10 *a;
        System.out.println("Multiplication of c and d is " +d);

        //Assignment operators addition
        int e = 6;
        e +=9;
        System.out.println("value of e is " +e);
        // Assignment mul
        int f = 6;
        f *=9;
        System.out.println("value of e is " +e);

        //Comparison operators
        System.out.println(6==8);
        System.out.println(6<8);

        // Logical operators
        System.out.println("Comparison is : " +(6<8 && 64<34));
        System.out.println("Comparison is : " +(6<8 || 64<34));

        //Bitwise operator
        System.out.println("Bitwise and : " +(5 & 1));
        System.out.println("Bitwise or : " +(5 | 1));
        System.out.println("Bitwise not : " +(~5));
    }
}
