package com.company;
import java.util.Scanner;
public class switchStatements {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an adult!");
            case 25 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to be retired");
            default -> System.out.println("Enjoy your life!!!!");
        }


    }
}
