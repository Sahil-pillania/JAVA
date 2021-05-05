package com.company;

public class Methods_Overloading {
    static void joke(){
        System.out.println("I invented a now word!\n" + "Plagiarism");
    }

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
        joke();   //calling this method

    }
}
