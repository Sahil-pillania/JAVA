package com.company;

import java.util.Scanner;

public class IntCheck {
    public static void main(String[] args) {
        System.out.println("What is your value ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
