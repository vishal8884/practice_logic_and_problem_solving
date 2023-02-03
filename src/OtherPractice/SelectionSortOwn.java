package OtherPractice;

import java.util.Arrays;

public class SelectionSortOwn {

	public static void main(String[] args) {
		int[] arr = {2,1,6,3,8};
		performSelectionSort(arr);
		System.out.println("sorted arr :: "+Arrays.toString(arr));
	}

	
	public static void performSelectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			System.out.println("arr between :: "+Arrays.toString(arr));
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					swap(arr, minIndex, j);
				}
			}
		}
	}
	
	private static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
