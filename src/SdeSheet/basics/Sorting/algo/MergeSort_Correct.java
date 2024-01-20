package SdeSheet.basics.Sorting.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort_Correct {
    public static void main(String[] args) {
        int[] arr = {7,2,11,1,5,22,16,0,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println("arr :: "+ Arrays.toString(arr));
    }


    private static void mergeSort(int[] arr,int low,int high){
        if(low == high){  //do not divide further
           return;
        }

        int mid = (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }


    //This will divide arr 2 parts and merge
    //1,2,5,7,11 and 0,8,16,22
    private static void merge(int[] arr, int low,int mid,int high){
        List<Integer> list = new ArrayList<>();

        int leftPointer = low;
        int rightPointer = mid+1;

        while(leftPointer <= mid && rightPointer <= high){
            if(arr[leftPointer] < arr[rightPointer]){
                list.add(arr[leftPointer]);
                leftPointer++;
            }
            else{
                list.add(arr[rightPointer]);
                rightPointer++;
            }
        }

        while(leftPointer <= mid){
            list.add(arr[leftPointer]);
            leftPointer++;
        }

        while(rightPointer <= high){
            list.add(arr[rightPointer]);
            rightPointer++;
        }

        int x=0;
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(x);
            x++;
        }
    }
}
