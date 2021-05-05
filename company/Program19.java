package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Program19 {
    public static void main(String[] args) {
        Employee Sahil = new Employee();
        Sahil.setName("Sahil");
        Sahil.salary = 50000;

        System.out.println( Sahil.getName());
        System.out.println( Sahil.getSalary());
    }
}
