package Course.sorting.leetcode.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_FindAllTheDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 3, 1, 5 };
		List<Integer> res = findDuplicates(arr);
		
		System.out.println("res :: "+res);

		System.out.println("arr :: " + Arrays.toString(arr));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		
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

		for(int j=0;j<nums.length;j++) {
			if(nums[j] != j+1) {
				list.add(nums[j]);
			}
		}
		
		return list;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
