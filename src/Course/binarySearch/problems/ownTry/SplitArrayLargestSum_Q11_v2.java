package Course.binarySearch.problems.ownTry;

public class SplitArrayLargestSum_Q11_v2 {

	public static void main(String[] args) {

		int[] arr = {7,2,5,10,8};
		int res = splitArray(arr, 2);
		System.out.println("res :: "+res);
		//minimize the largest sum among these m subarrays.
	}                   //did not work

	public static int splitArray(int[] nums, int m) {

		int start =0;          //m=1
		int end =0;            // m= arr.length =5
		
		for(int i=0;i<nums.length;i++) {
			start = Math.max(start, nums[i]); //in the end start will have max val
			end += nums[i];
		}
        
        
        //binary search
        //10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32
		
		//7,2,5,10,8
        while(start < end) {        
        	int mid = start + (end - start)/2;
        	int sum =0;
        	int partition =1;
        	for(int num : nums) {
        		
        		if(sum + num > mid) {
        			sum = num;
        			partition++;
        		}
        		else {
        			sum = sum +num;
        		}
        	}
        	
        	if(partition > m) {
    			start = mid +1;
    		}
    		else {
    			end = mid;
    		}
        }
        
		return start;
	}
	
	

}
