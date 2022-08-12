package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q1_FirstAndLastPosInSortedArray {

	public static void main(String[] args) {

		int[] arr = {5,7,7,8,8,10};
		int[] res = searchRange(arr, 8);
		System.out.println("res :: "+Arrays.toString(res));
 	}

	public static int[] searchRange(int[] nums, int target) {
		
		int firstoccur = binarySearchFirstOrLast(nums, target, true);
		int lastoccur = binarySearchFirstOrLast(nums, target, false);
		
		
		
		return new int[] {firstoccur,lastoccur};
	}
	
	public static int binarySearchFirstOrLast(int[] nums,int target, boolean first) {
		int start = 0;
		int end = nums.length -1;
		int ans = -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target > nums[mid]) {
				start = mid + 1;
			}
			else if(target < nums[mid]) {
				end = mid -1;
			}
			else {
				ans = mid;
				if(first)
				    end = mid -1;
				else
					start = mid + 1;
			}
		}
		System.out.println("start :: "+start+"          end :: "+end);
		return ans;
	}

}
