package Course.sorting.Assignments.Easy;

import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		List<Integer> res = findDisappearedNumbers(arr);
		System.out.println("res :: "+res);

	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		System.out.println("soreted arr :: "+Arrays.toString(nums));
		for(int i=0;i<nums.length;i++) {
			
		}
		
		return null;
	}

}
