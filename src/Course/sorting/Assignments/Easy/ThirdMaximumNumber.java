package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] nums = {4,5,1,3,2};
		int[] nums2 = {2,2,3,1};
		int[] nums3 = {-2147483648,1,1};
		int res = thirdMax(nums2);
		System.out.println("res :: "+res);
	}

	public static int thirdMax(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		
		System.out.println("arr :: "+Arrays.toString(arr));
		
        return -1;
	}
	
	
	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}


}
