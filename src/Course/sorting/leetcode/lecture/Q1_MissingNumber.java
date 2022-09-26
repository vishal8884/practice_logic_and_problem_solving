package Course.sorting.leetcode.lecture;

import java.util.Arrays;

public class Q1_MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		int[] arr2 = {0,1};
		
		int res = missingNumber(arr);
		
		System.out.println("arr :: "+Arrays.toString(arr)+"     res :: "+res);
	}

	public static int missingNumber(int[] nums) {
		int i=0;
		
		while(i < nums.length) {
			int correct = nums[i];
			System.out.println("i :: "+i+"    nums[i] :: "+nums[i]+"    correct :: "+correct+"     nums :: "+Arrays.toString(nums));

			if(nums[i] >= nums.length) {
				
			}
			if((nums[i] < nums.length) && (nums[i] != nums[correct])) {
				swap(nums,i,correct);
			}
			else {
				i++;
			}
		}
		
		for(int j=0;j<nums.length;j++) {
			if(nums[j] != j) {
				return j;
			}
		}
		
		return -1;
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public static int missingNumberBrute(int[] nums) {
		Arrays.sort(nums);

		for(int i=0;i<nums.length;i++) {
			if(nums[i] != i) {
				return i;
			}
		}
		
		return nums.length;
	}

}
