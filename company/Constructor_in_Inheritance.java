package com.company;

class Base1{
    public int x;

    Base1(){
        System.out.println("I am a base class constructor");
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    static class Derived1 extends Base1{
       public int y;

       Derived1(){
           System.out.println("I am derived class constructor");
       }
        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Base1.Derived1 d = new Base1.Derived1();
    }
}
