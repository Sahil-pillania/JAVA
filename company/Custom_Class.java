package com.company;
 class Employee1{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("this is our new custom class");
        Employee1 Sahil = new Employee1();  // Instantiating a new Employee object
        Employee1 Rahul = new Employee1();  // Instantiating a new Employee object
        //Setting properties-->
        Sahil.id = 11;
        Sahil.name = "Sahil Pillania";
        Rahul.id = 12;
        Rahul.name = "Rahul Singh";
        System.out.println(Sahil.id);
        System.out.println(Sahil.name);
        // printing the details using method
        Sahil.printdetails();
        Rahul.printdetails();
    }
}
