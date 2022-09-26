package Course.sorting.leetcode.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_DisappearedNumbersInArray {

	public static void main(String[] args) {

		int[] arr = {4,3,2,7,8,2,3,1};
		List<Integer> res = findDisappearedNumbers(arr);
		System.out.println("res :: "+res);
		
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		int i=0;
		List<Integer> res = new ArrayList<>();
		
		while(i < nums.length) {
			int correctPos = nums[i] - 1;
			
			if(nums[i] != nums[correctPos]) {
				swap(nums, i, correctPos);
			}
			else {
				i++;
			}
		}
		
		System.out.println("cycle sorted nums :: "+Arrays.toString(nums));
		
		for(int j=0;j<nums.length;j++) {
			if(nums[j] != j+1) {
				res.add(j+1);
			}
		}
		
		return res;
	}
	
	
	private static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
