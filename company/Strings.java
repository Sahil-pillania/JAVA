package com.company;
// Strings and their print methods

public class Strings {
    public static void main(String[] args) {
        String name = new String("Sahil"); // Method 1
        String name2 = "Sahil";  // Method 1
        System.out.print("The name is: ");
        System.out.println(name);
        System.out.print("The name is: ");
        System.out.println(name2);

        //printf Method
        int a = 5;
        float b = 5.6664f;
        System.out.printf("The value of a is %d and value of b is %8.2f",a,b);
        System.out.format("  The value of a is %d and value of b is %f",a,b);
    }
}
