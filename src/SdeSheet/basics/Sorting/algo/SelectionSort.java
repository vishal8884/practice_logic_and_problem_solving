package SdeSheet.basics.Sorting.algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,8,2,6,8};
        selectionSort(arr);

        System.out.println("sorted array :: "+ Arrays.toString(arr));

    }

    /*
       1,|2,4,3,6,8
       1,2|,4,3,6,8
       1,2,3|4,6,8
     */


    private static void selectionSort(int[] arr){
        int n = arr.length;
        int min,minPos;

        for(int i=0;i<n;i++){
            min = Integer.MAX_VALUE;
            minPos = -1;

            for(int j=i;j<n;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minPos = j;
                }
            }

            swap(i,minPos,arr);
        }

    }


    private static void swap(int a,int b,int[] arr){
        if(a == b)
            return;

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
