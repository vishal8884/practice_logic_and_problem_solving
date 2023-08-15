package OtherPractice;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] arr = {4,2,5,1,0};
		
		bubbleSort(arr);
		
		System.out.println("arr sorted :: "+Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
				System.out.println("i :: "+i+"     j :: "+j+"        arr :: "+Arrays.toString(arr));
			}
			System.out.println();
		}
	}
	
	
	private static void swap(int[] arr, int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
