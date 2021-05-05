package com.company;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a = 6;

        System.out.println(a++);  // here value execute without increment --post increment
        System.out.println(a);     // a is incremented here
        System.out.println(++a);   // a is incremented here again  --pre increment
        System.out.println(a);     // value of a
        //
        int y = 7;
        int x = ++y +8;   // y is pre increment so y takes 8 as value
        System.out.println("value of x is: " +x);
        //
        char ch = 'b';
        System.out.println(++ch);

    }
}
