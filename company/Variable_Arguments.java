package com.company;

public class Variable_Arguments {
    // no need to define lot of function like this-->
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...arr){
      // Available as int [] arr
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs");
        System.out.println("The sum of 4 and 5 is: " +sum(4, 5));
        System.out.println("The sum of 4, 5 and 7 is: " +sum(4, 5, 7));
    }
}
