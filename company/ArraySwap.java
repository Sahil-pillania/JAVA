package com.company;
// Reversing the index value of an array
public class ArraySwap {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        System.out.println(n);
        int temp;

        for(int i=0; i<n; i++){
            // swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element +" ");
        }
    }
}
