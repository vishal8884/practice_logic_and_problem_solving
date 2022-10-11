package Course.sorting.leetcode.lecture;

import java.util.Arrays;

public class Q3_FindTheDuplicateNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 3, 2 };
		int res = findDuplicate(arr);
		
		System.out.println("res :: "+res);

		System.out.println("arr after :: " + Arrays.toString(arr));
	}

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i+1) {
				int correct = nums[i] - 1;
				if (nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					return nums[i];
				}
			} else {
               i++;
			}
		}
		System.out.println("nums :: " + Arrays.toString(nums));
		return -1;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}

/*
 * public static int findDuplicate(int[] nums) { int i=0; while(i < nums.length)
 * { int correct = nums[i] - 1; if(nums[i] != nums[correct]) { swap(nums, i,
 * correct); } else { i++; } }
 * System.out.println("nums :: "+Arrays.toString(nums)); return
 * nums[nums.length-1]; }
 */
