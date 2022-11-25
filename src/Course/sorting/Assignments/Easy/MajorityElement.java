package Course.sorting.Assignments.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = {2,2,1,1,1,2,2,3,3};
		int[] nums2 = {2,3,3,3,4};
		
		int res = majorityElement(nums2);
		System.out.println("res :: "+res);
	}

	public static int majorityElement(int[] nums) {
		int temp = nums[0];
		Arrays.sort(nums);
		System.out.println("nums :: "+Arrays.toString(nums));
		int[] c = {temp,1};
		int max = Integer.MIN_VALUE;
		int maxVal = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == nums[i+1]) {
				c[1]++;
				c[0] = nums[i];
			}
			else {
				c[1] = 1;
			}
			System.out.println("i :: "+i+"     nums[i] :: "+nums[i]+"     nums[i+1] :: "+nums[i+1]+"     c[0] :: "+c[0]+"      c[1] :: "+c[1]);
			
		}
		//map.put(c[0],c[1]);
		System.out.println("max :: "+max+"       maxval :: "+maxVal);
		
		return maxVal;
	}

}
