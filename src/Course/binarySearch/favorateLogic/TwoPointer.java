package Course.binarySearch.favorateLogic;

public class TwoPointer {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3,4};
		
		int start = 0;
		int end = nums.length-1;
		int sum =4;
		
		while(start <= end) {
			System.out.println("start :: "+start+"     end :: "+end);
			if(nums[start] + nums[end] == sum) {
				System.out.println("nums[start] :: "+nums[start]+"    nums[end] :: "+nums[end]);
				break;
			}
			else if(nums[start] + nums[end] > sum) {
				end --;
			}
			else {
				start++;
			}
		}
	}
	

}
