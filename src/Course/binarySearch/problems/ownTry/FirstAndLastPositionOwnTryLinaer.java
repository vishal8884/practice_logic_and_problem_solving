package Course.binarySearch.problems.ownTry;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastPositionOwnTryLinaer {

	public static void main(String[] args) {

		int[] nums = {3,3,3};   //1,2,3,4,2,5,7
		int[] res = searchRangeLinear(nums, 3);
		
		System.out.println("res :: "+Arrays.toString(res));
	}
	

	public static int[] searchRangeLinear(int[] nums, int target) {
		int[] res = {-1,-1};
		boolean first = false;
		boolean second = false;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target && !first) {
				res[0] = i;
				first = true;
			}
			else if(nums[i] == target && first) {
				res[1] = i;
				second = true;
			}
		}

		if(!second)
			res[1] = res[0];
		
		return res;
	}

}
