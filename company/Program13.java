package com.company;

public class Program13 {
    public static void main(String[] args) {
        // Program to find out whether a given integer is present in an array or not.
        float [] marks = {98.55f, 75.7f, 88.50f, 73.50f, 80.5f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element: marks) {
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("The value is present in the array");

        }
        else{
            System.out.println("The value is not present in the array");

        }
    }
}
