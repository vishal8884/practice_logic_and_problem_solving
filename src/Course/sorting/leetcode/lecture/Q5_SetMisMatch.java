package Course.sorting.leetcode.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5_SetMisMatch {

	public static void main(String[] args) {
		int[] arr = {1,2,2,4};
		int[] res = findDuplicates(arr);
		
		System.out.println("res :: "+Arrays.toString(res));

		System.out.println("arr :: " + Arrays.toString(arr));
	}

	public static int[] findDuplicates(int[] nums) {
		int[] arr = new int[2];
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) {
				swap(nums, i, correct);
			}
			else {
				i++;
			}
		}
		
		System.out.println("nums :: "+Arrays.toString(nums));

		for(int j=0;j<nums.length;j++) {
			if(nums[j] != j+1) {
				arr[0] = nums[j];
				arr[1] = j+1;
			}
		}
		
		return arr;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
