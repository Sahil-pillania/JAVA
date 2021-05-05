package com.company;

public class ForEachLoop {
    public static void main(String[] args) {

        //Displaying the Arrays (for-each loop)
        int [] marks = {98, 75, 88, 73, 80};
        System.out.println("The elements of array are: ");
        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
