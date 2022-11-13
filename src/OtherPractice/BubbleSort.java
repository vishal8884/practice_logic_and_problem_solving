package OtherPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
  
		int[] arr = {4,2,1,5,3};
		bubbleSortFast(arr);
		
		System.out.println("arr :: "+Arrays.toString(arr));
	}
	
	
	public static void bubbleSortFast(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1] > arr[j]) {
					swap(arr, j, j-1);
				}
			}
			System.out.println("arr inside:: "+Arrays.toString(arr));
		}
	}
	
	public static void bubbleSortSlow(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
	}
	
	
	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
