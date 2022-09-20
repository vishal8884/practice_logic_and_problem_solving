package Course.Assignments.searching.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Q4_CountOfSmallerNumberAfterSelf {

	public static void main(String[] args) {

		int[] arr = {5,2,6,1};
		List<Integer> res = countSmaller(arr);
		System.out.println("res :: "+res);
	}
	
	public static List<Integer> countSmaller(int[] nums) {   
		List<Integer> res = new ArrayList<>();
		
		
		
		return res;
	}
	
	
	
	//-------------------------------------------countSmaller-----------------------------------------------------------------------------------------

	public static List<Integer> countSmaller2(int[] nums) {   //naive approach ...time limit exceed 62/64 passed
		int c = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i< nums.length ;i++) {
			for(int j = i+1; j< nums.length ; j++) {
				if(nums[i] > nums[j]) {
					c++;
				}
			}
			list.add(c);
			c=0;
		}
		
		return list;
	}

}
