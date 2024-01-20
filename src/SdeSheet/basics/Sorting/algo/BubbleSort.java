package SdeSheet.basics.Sorting.algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6,8};
        bubbleSort(arr);

        System.out.println("arr :: "+ Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    swap(i,j,arr);
                    System.out.println("arr :: "+ Arrays.toString(arr) );
                }
            }
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
