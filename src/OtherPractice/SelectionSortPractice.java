package OtherPractice;

import java.util.Arrays;

public class SelectionSortPractice {

	public static void main(String[] args) {

		int[] arr = {4,2,5,1,3};
		selectionSort(arr);
		
		System.out.println("selection sorted arr :: "+Arrays.toString(arr));
	}
	
	
	public static void selectionSort(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			int[] max = finsMax(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[max[1]];
			arr[max[1]] = temp;
		}
	}
	
	public static int[] finsMax(int[] arr,int len) {
		int maxVal = Integer.MIN_VALUE;
		int maxPos = -1;
		for(int i=0;i<=len;i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i]; 
				maxPos = i;
			}
		}
		
		return new int[] {maxVal,maxPos};
	}

}
