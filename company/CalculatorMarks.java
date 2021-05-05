package com.company;
import java.util.Scanner;

public class CalculatorMarks {
    public static void main(String[] args) {
        System.out.println("5 subjects and max marks are 100 in each subject");
        Scanner sc = new Scanner(System.in);

        System.out.println("1st subject marks: ");
        int a = sc.nextInt();

        System.out.println("2nd subject marks ");
        int b = sc.nextInt();

        System.out.println("3rd subject marks ");
        int c = sc.nextInt();

        System.out.println("4th subject marks ");
        int d = sc.nextInt();

        System.out.println("5th subject marks ");
        int e = sc.nextInt();

        int f = a+b+c+d+e;
        int g = f*100/500;
        System.out.println("percentage(%)");
        System.out.println(g);

    }
}



