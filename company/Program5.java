package com.company;
// Program to fill in a letter template which looks like as below in program.
public class Program5 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!"; // Templete
         letter = letter.replace("<|name|>","Sahil");
        System.out.println(letter); // String after replace
    }
}
