package Sorting;

public class SelectionSort {

    public static void printArray(int array[])
    {
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
 
        int arr[] = {5, 7, 1, 9, 2};

        for(int i=0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length;j++){
                
                if(arr[small]> arr[j]){

                    small = j;
                }
            }
            //swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        } 
        printArray(arr);
    }
}
