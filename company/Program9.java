// Write a program to find out the day of the week given the number [ 1 for monday, 2 for tuesday .....and so on!]
package com.company;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Enjoy your life!!!!");
        }
    }
}
