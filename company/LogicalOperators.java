package com.company;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For logical AND");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a1 && b1 && c1) {
            System.out.println("yes");
             }
        else {
            System.out.println("NO");
        }
        System.out.println("For logical OR");
        boolean a = false;
        boolean b = false;
        boolean c = true;
        if (a || b || c) {
            System.out.println("yes");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("NOT of a is:" + !a);
        System.out.println("NOT of b is:" + !b);
        System.out.println("NOT of c is:" + !c);
    }}
