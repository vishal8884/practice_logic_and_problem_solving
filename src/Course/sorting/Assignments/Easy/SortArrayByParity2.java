package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class SortArrayByParity2 {

	public static void main(String[] args) {

		int[] arr = {4,2,5,7};
		int[] res = sortArrayByParityII(arr);

		System.out.println("res :: " + Arrays.toString(res));
	}

	public static int[] sortArrayByParityII(int[] nums) {

		int[] res = new int[nums.length];
		int xEven = 0;
		int xOdd = 1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2 == 0) {
				res[xEven] = nums[i];
				xEven=xEven+2;
			}
			else {
				res[xOdd] = nums[i];
				xOdd = xOdd+2;
			}
		}
		return res;
	}


}
