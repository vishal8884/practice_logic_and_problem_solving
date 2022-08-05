package Course.Assignments.searching.easy;

import java.util.Arrays;

public class Q4_TwoSum {

	public static void main(String[] args) {

		int[] arr = {2,7,11,15,17,23,26,34,35,49};
		int[] res = twoSum(arr, 60);
		
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] twoSum(int[] numbers, int target) {               // //two pointer approach

		int start =0;
		int end = numbers.length -1;
		int sum = 0;
		
		while(start <= end) {
			
			sum = numbers[start] + numbers[end];
			
			if(sum < target) {
				start++;
			}
			else if(sum > target) {
				end --;
			}
			else {
				return new int[] {start,end};
			}
		}
		
		return new int[] {-1,-1};
	}
}
