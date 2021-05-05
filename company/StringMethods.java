package com.company;
//String Methods

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sahil";
        System.out.println(name);
        //length
        System.out.print("The length of string is: ");
        int value = name.length();
        System.out.println(value);
        //toLowerCase
        System.out.print("The lstring is: ");
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //toUpperCase
        System.out.print("The ustring is: ");
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        //trim
        String nonTrimmedString = "      Sahil     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        // substring()
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));
        //replace()
        System.out.println(name.replace('a', 'o'));// replaces all occurences
        // startswith()
        System.out.println(name.startsWith("S"));

        //endswith()
        System.out.println(name.endsWith("l"));

        //charAt()
        System.out.println(name.charAt(1));

        //indexOf()
        System.out.println(name.indexOf("hi"));
    }
}
