package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x in base class");
        this.x = x;
    }
    static class Derived extends Base {
        int y;
        int x;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


        // Derived class
        Base.Derived d = new Base.Derived();
        d.setX(55);
        System.out.println(d.getX());
        d.setY(5);
        System.out.println("set y is : "+d.getY());

    }
}
