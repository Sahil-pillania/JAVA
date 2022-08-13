package Sorting;

public class InsertionSort {

    public static void printArray(int array[])
    {
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
 
        int arr[] = {5, 7, 1, 9, 2};

        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int  j = i-1;

            while(j>=0 && current < arr[j]){
                arr[j+1]= arr[j];
                j--;
            }

            arr[j+1] = current;
        } 
        printArray(arr);
    }
}
