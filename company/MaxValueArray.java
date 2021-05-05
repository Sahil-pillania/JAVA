package com.company;
// Finding the max value of the array
public class MaxValueArray {
    public static void main(String[] args) {
        int [] arr = {1, 33, 56, 77, 2, 44, 31, 3, 7, 12, 9, 46, 54};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is:" +max);
    }
}
