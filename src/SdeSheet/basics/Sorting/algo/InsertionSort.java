package SdeSheet.basics.Sorting.algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,1,77,12,1,8,19};
        insertionSort(arr);
        System.out.println("Sorted arr :: "+ Arrays.toString(arr));
    }


    private static void insertionSort(int[] arr){
        for(int i=1 ;i<arr.length; i++){
           for(int j = i ; j>=1 ;j--){
               if(arr[j] < arr[j-1]){    // if elem is less than prev elem we are swapping to correct place
                   swap(arr,j,j-1);
               }
           }
        }
    }


    private static void swap(int[] arr,int a, int b){
        if(a == b)
            return;

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
