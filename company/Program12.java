package com.company;

public class Program12 {
    public static void main(String[] args) {
        // Program of an array of 5 floats and calculating their sum.
        float [] marks = {98.55f, 75.7f, 88.50f, 73.50f, 80.5f};
        float sum = 0;

        for(float element: marks)
        {
            sum = sum + element;
            System.out.println("The value of sum is " +sum);// shows every increment value
        }
    }
}
