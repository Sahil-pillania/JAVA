package com.company;

public class ArrayProperties {
    public static void main(String[] args) {
        int [] marks = {98, 75, 88, 73, 80};
        //float [] marks = {98, 75.7f, 88.50f, 73.50f, 80};
        String [] students ={"Sahil", "Rahul", "Somvir", "Arun", "Tarun"};

        System.out.println(marks.length);  //for length
        System.out.println(marks[1]);   // value at index 1
        System.out.println(students.length);  // this shows the length of strings


        //Displaying the Arrays (for loop)
        System.out.println("The elements of array are: ");
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
