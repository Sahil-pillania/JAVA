package com.company;
import java.util.Scanner;   // We take input using Scanner class
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these numbers is ");
        System.out.println(sum);

    }
}
