package Course.sorting.own;

import java.util.Arrays;

public class SelectionSortOwn {

	public static void main(String[] args) {

		int[] arr = {4,5,1,2,3};
		int[] arr2 = {4,2,5,3,1};
		int[] arr3 = {5,4,3,2,1};
		int[] arr4 = {2,1};
		
		System.out.println("arr before sort :: "+Arrays.toString(arr4));
		selectionSort(arr4);
		System.out.println("arr after sort :: "+Arrays.toString(arr4));
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length-1;
		
		for(int i=n;i>=0;i--) {
			int[] max = findMaxinArr(arr, i);   //max[0] = index      max[1] = value
			
			int temp = arr[i];
			arr[i] = max[1];
			arr[max[0]] = temp;
			
			System.out.println("max val :: "+max[1]+"    max index :: "+max[0]+"     i :: "+i+"      arr :: "+Arrays.toString(arr));
		}
		
	}
	
	
	public static int[] findMaxinArr(int[] arr,int len) {
		int max = Integer.MIN_VALUE;
		int maxi = -1;
		
		for(int i=0;i<=len;i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxi = i;
			}
		}
		
		return new int[] {maxi,max};
	}

}
