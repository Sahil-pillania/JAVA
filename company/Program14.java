package com.company;

public class Program14 {
    public static void main(String[] args) {
        // Calculating the average marks from an array containing marks of all students using for-each loop.
        float [] marks = {98.55f, 75.7f, 88.50f, 73.50f, 80.5f};
        float sum = 0;


        for(float element: marks)
        {
            sum = sum + element;

        }
        System.out.println("The value of average marks is " +sum/marks.length);
    }
}
