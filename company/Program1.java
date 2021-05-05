package com.company;
// How will you write the following expressions in java? x-y/2, b*b-4ac/2a
public class Program1 {
    public static void main(String[] args) {
        //x-y/2
        int x = 16;
        int y = 8;
        int result = (x-y)/2;
        System.out.println(result);

        //b*b-4ac/2a
        int b = 4;
        int a = 2;
        int c = 4;
        int result2 = (b*b-4*a*c)/(2*a);
        System.out.println(result2);
    }
}
