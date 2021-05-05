package com.company;
// Creating a cylinder with its getters and setters to set its radius and height. Use specific formulas to get Surface area and height of cylinder.
// for more accuracy in pi value just use math.PI at the place of 3.14
class MyCylinder{
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
    public double surfaceArea(){                                    // function for surface area
        return 2* 3.14* radius* radius + 2*3.14* radius* height;
    }
    public double volume(){                                    // function for volume
        return  3.14* radius* radius *height;
    }
}
public class Program21 {
    public static void main(String[] args) {
        MyCylinder myCylinder = new MyCylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println("Surface area of cylinder is: " +myCylinder.surfaceArea());
        System.out.println("Volume of cylinder is: " +myCylinder.volume());

    }
}
