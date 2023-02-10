package OtherPractice;

import java.util.Arrays;

public class SelectionSortOwn {

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3};
		performSelectionSort(arr);
		System.out.println("sorted arr :: "+Arrays.toString(arr));
	}

    public static void performSelectionSortUsingMax(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int maxIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j; //at last min will be stored here in minIndex
				}
			}
			swap(arr, i, maxIndex);
			System.out.println("arr between :: "+Arrays.toString(arr));
		}
	}


	public static void performSelectionSort(int[] arr) {

		
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j; //at last min will be stored here in minIndex
				}
			}
			swap(arr, i, minIndex);
			System.out.println("arr between :: "+Arrays.toString(arr));
		}
	}
	
    public static void performSelectionSortOwnNotOptimized(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
			System.out.println("arr between :: "+Arrays.toString(arr));
		}
	}
	
	private static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
