package com.company;
//Program to detect double and triple spaces in a string.
public class Program6 {
    public static void main(String[] args) {
        String mystring = "this string contains  double   and triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }
}
