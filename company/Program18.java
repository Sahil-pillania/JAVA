package com.company;
// Recursive function to calculate sum of first n natural numbers
public class Program18 {
   public static int sumRecur(int n) {
       if (n == 1) {
           return 1;
       }
       else {
           return n + sumRecur(n - 1);
       }
   }
       public static void main(String[] args){
            int z = sumRecur(5);
            System.out.println(z);
        }

    }

