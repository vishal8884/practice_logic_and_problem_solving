package OtherPractice;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr = {4,2,5,3,1};
		selectionSort(arr);
	}
	
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			swap(arr, i, minIndex);
		}
		
		System.out.println("selection sorted array :: "+Arrays.toString(arr));
	}
	
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
