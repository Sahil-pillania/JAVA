package com.company;

public class Methods_in_java {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x + y)* 5;
        }
        return z;
    }

    public static void main(String[] args) {


        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);     // using the above function
        System.out.println(c);  //printing c

        // Method invocation using object creation
        // Methods_in_java obj = new Methods_in_java();
        // c = obj.logic(a,b);

    }
}
