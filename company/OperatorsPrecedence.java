package com.company;

public class OperatorsPrecedence {
    public static void main(String[] args) {
        int a = 6*5-36/2;   // output according to associativity and precedence
        /*
        =6*5
        =36/2
        =30-18=12
         */
        System.out.println("a is: " +a);
        // Associativity and precedence
        int b = 80/5-36*2;
        /*
        = 14-36*2
        = 14-72
        = -56
         */
        System.out.println("b is: " +b);
    }
}
