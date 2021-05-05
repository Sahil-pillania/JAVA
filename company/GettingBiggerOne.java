package com.company;
import java.util.Scanner;   //Scanner importing

public class GettingBiggerOne {
    public static void main(String[] args) {
        System.out.println("Getting the bigger one into three inputs ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Bigger Number is:" + d);


    }
}
