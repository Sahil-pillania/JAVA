package com.company;
// Conversion of Km into Miles.
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("Enter the value of Kms: ");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        double result = (input/1.609);
        System.out.println("Value in miles is: " + result);
    }
}
