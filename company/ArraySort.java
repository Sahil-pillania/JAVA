package com.company;
// Checking whether an array is sorted or not.
public class ArraySort {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {1,34,32,56,67,87,54};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }

        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
