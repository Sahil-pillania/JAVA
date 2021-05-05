package com.company;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        //int age = 56;
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age > 56) {
            System.out.println("experienced");
        } else if (age > 46) {
            System.out.println("semi-experienced");
        } else if (age > 36) {
            System.out.println("just-experienced");
        } else {
            System.out.println("not-experienced");
        }
    }
}
