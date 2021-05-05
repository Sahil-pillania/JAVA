package com.company;
//Taking marks of three subjects and find marks should be at least 33% in each subject and average require equal to 40% minimum.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics ");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry ");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Mathematics ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.00f;
        System.out.println("Your average is: " +avg);  // Average output
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You have been promoted!");
        }else {
            System.out.println("Please try again!");
        }

    }
}