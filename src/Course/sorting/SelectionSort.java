package Course.sorting;

import java.util.Arrays;

public class SelectionSort {

	// notes

	// step 1) take max elem with len= n-1 and swap with its correct pos

	// step 2) take max elem with len = n-2 and swapwith its pos...so on

	public static void main(String[] args) {

		int[] arr = { 4, 5, 1, 2, 3 };
		int[] arr2 = { 4, 2, 5, 3, 1 };
		int[] arr3 = { -2147483648, 1, 1 };

		System.out.println("arr before sort :: " + Arrays.toString(arr2));
		selectionSort(arr2);
		System.out.println("arr after sort :: " + Arrays.toString(arr2));
	}

	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			System.out.println("arr between :: "+Arrays.toString(arr));
			swap(arr, i, minIndex);
		}
		
		System.out.println("arr :: "+Arrays.toString(arr));
	}
	
	
	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}

// take the max and swat it with last elem       | is wall
/*
 * 4 2 5 3 1| 4 2 1 3|5 3 2 1|4 5 1 2|3 4 5
 */
