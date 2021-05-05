package com.company;
// Replacing the spaces with underscores.
public class Program4 {
    public static void main(String[] args) {
        String text = "To lower case";
        System.out.println(text);
        System.out.println("After repacing: ");
        text = text.replace(" ", "_");
        System.out.println(text);
    }
}
