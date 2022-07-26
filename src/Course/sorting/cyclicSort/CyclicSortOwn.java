package Course.sorting.cyclicSort;

import java.util.Arrays;

public class CyclicSortOwn {// In cyclicSort all numbers will be there but not in order

	public static void main(String[] args) {

		int[] arr = {3,5,2,1,4};
		
		System.out.println("before sort :: "+Arrays.toString(arr));
		cyclicSort(arr);
		System.out.println("after sort :: "+Arrays.toString(arr));
	}
	
	public static void cyclicSort(int[] arr) {
		int i=0;
		
		while(i < arr.length) {
			int correct = arr[i] - 1;        // eg 3 needs to be there in 2 index
			
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}
			else {
				i++;
			}
		}
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
