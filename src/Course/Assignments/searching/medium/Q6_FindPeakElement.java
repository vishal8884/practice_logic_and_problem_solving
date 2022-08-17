package Course.Assignments.searching.medium;

public class Q6_FindPeakElement {

	public static void main(String[] args) {

		int[] arr = {1,2,1,3,5,6,4};   //len = 7 ...... mid = 3  midval = 3
		int[] arr2 = {2,1};
		int res = findPeakElement(arr2);
		
		System.out.println("res :: "+res);
	}

	public static int findPeakElement2(int[] nums) {

		int start = 0; 
		int end = nums.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"      mid :: "+mid+"      end :: "+end+"      midval :: "+nums[mid]);
		    
			if(mid > start && mid < end && (nums[mid] > nums[mid+1]) && (nums[mid] > nums[mid-1])) {
				return mid;
			}
			
		}
		
		return -1;
	}

	
	///////////////////////////////////////////////////Linear search///////////////////////////////////////////////////////////////
	
	public static int findPeakElement(int[] nums) {

        long max  = Long.MIN_VALUE;
        int res = -1;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                res = i;
                System.out.println("max :: "+max);
            }
        }
        
        return (int)res;
	}

}
