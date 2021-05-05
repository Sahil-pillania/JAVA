package com.company;
// Creating a cylinder with its getters and setters to set its radius and height.
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {        //getter
        return radius;
    }

    public void setRadius(int radius) {   //setter
        this.radius = radius;
    }

    public int getHeight() {           //getter
        return height;
    }

    public void setHeight(int height) {     //setter
        this.height = height;
    }
}
public class Program20 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

    }
}
