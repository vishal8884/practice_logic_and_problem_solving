package OtherPractice;

public class SplitArrayPractice {

	public static void main(String[] args) {
       int[] arr = {7,2,5,10,8};
       int res = splitArray(arr, 2);
       
       System.out.println("res :: "+res);
	}

	public static int splitArray(int[] nums, int k) {

		int start =0;
		int end = 0;
		for(int i=0;i<nums.length;i++) {
			start = Math.max(start, nums[i]);
			end = end + nums[i];
		}
		
		System.out.println("before------------------->      start :: "+start+"    end :: "+end);
		//10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32
		
		while(start < end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"       mid :: "+mid+"       end :: "+end);
			int sum = 0, pieces=1;
			
			for(int num : nums) {
				if(sum + num > mid) {
					sum = num;
					pieces++;
				}
				else {
					sum = sum + num;
				}
			}
			
			if(pieces > k) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		
		return start;
	}

}
