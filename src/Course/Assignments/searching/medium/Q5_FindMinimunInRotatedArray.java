package Course.Assignments.searching.medium;

public class Q5_FindMinimunInRotatedArray {

	public static void main(String[] args) {

		int[] arr = {3,4,5,6,7,1,2};
		int[] arr2 = {3,4,5,1,2};
		int[] arr3= {4,5,6,7,0};
		int[] arr4 = {11,13,15,17};
		
		int res = findMin(arr);
		
		System.out.println("res :: "+res);
	}

	public static int findMin(int[] nums) {

		int start = 0;
		int end = nums.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"       end :: "+end+"         midval :: "+nums[mid]);
			
			if(mid > start && nums[mid] < nums[mid-1]) {
				return nums[mid];
			}
			if(mid < end && nums[mid] > nums[mid+1]) {
				return nums[mid+1];
			}
			if(nums[mid] > nums[start]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		
		return nums[0];
	}

}
