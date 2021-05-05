// Calculate the income tax paid by an employee to the government as per the slabs mentioned below:
//    2.5l to 5l - 5%                   here l = lakh
//    5.0l to 10l -20%                  here l = lakh
//    above 10.0l -30%                  here l = lakh
package com.company;
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs: ");
        float tax = 0;
        float income = sc.nextByte();

        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " +tax);
    }
}
