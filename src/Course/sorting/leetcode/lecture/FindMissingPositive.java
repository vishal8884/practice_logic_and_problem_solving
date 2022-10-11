package Course.sorting.leetcode.lecture;

import java.util.Arrays;

public class FindMissingPositive {

	public static void main(String[] args) {

		int[] arr = {1,2,0};
		int[] arr2 = {7,8,9,11,12};
		
		int res = firstMissingPositive(arr2);
		
		System.out.println("res :: "+res);
	}

	public static int firstMissingPositive(int[] nums) {

		int i=0;
		while(i < nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] > 0 && nums[i] != nums[correct]) {
				swap(nums, i, correct);
			}
			else {
				i++;
			}
		}
		
		System.out.println("nums :: "+Arrays.toString(nums));
		
		for(int j=0;j<nums.length;j++) {
			if(nums[j] != j+1) {
				return j+1;
			}
		}
		
		return -1;
	}
	
	public static void swap(int[] nums,int a,int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
