package com.company;
import java.util.Scanner;

public class HelloGoodDay {
    public static void main(String[] args) {
        System.out.print("What is your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " Have a good day ");
    }
}
