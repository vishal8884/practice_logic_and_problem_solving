package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q15_FindTheDuplicateNumber {

	public static void main(String[] args) {

		int[] arr = {1,3,2,6,7,8,10,10,13};
		int[] arr2 = {1,3,4,2,2};
		int res = findDuplicate(arr);
		
		System.out.println("res :: "+res);
	}

	public static int findDuplicate(int[] nums) {             //using binarysearch

		int[] count = new int[nums.length+1];
		
		for(int i=0;i<nums.length;i++) {
			count[nums[i]]++;
			
			if(count[nums[i]] > 1) {
				return nums[i];
			}
		}
		
		return -1;
	}
	
	
	
	////////////////////////////////////////Brute force///////////////////////////////////////////////////////////////////////////////////////
	
	
    public static int findDuplicate2(int[] nums) {
		
		Arrays.sort(nums);

		for(int i=0;i<nums.length-1;i++) {
			
			if(nums[i] == nums[i+1]) {
				return nums[i];
			}
			
			System.out.println("i :: "+i+"      nums[i] :: "+nums[i]);
		}
		
		return -1;
	}

}
