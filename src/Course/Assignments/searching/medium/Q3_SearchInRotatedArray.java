package Course.Assignments.searching.medium;

public class Q3_SearchInRotatedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,0,1,2};
		int[] arr2 = {6,7,1,2,3,4,5};
		int res = findPivot(arr2);
		System.out.println("res :: "+res);
	}
	
    public static int search(int[] nums, int target) {
        
    	int pivot = findPivot(nums);
    	System.out.println("pivot :: "+pivot);
    	
//    	if(pivot == -1) {
//    		performBinarySearch(nums, target,0,nums.length-1);
//    	}
    	
    	int res = performBinarySearch(nums,target,0,pivot);
    	if(res != -1) {
    		return res;
    	}
    	
    	return performBinarySearch(nums,target,pivot+1,nums.length-1);
    }
    
 public static int performBinarySearch(int[] arr,int target,int start, int end) {
    	
    	
    	while(start<=end) {
    		int mid = start + (end -start)/2;
    		
    		if(arr[mid] < target) {
    			start = mid +1;
    		}
    		else if (arr[mid] > target) {
    			end = mid -1;
    		}
    		else {
    			return mid;
    		}
    	}
    	
    	return -1;
    }

	public static int findPivot(int[] nums) {    //6,7,1,2,3,4,5

		int start = 0;
		int end = nums.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"       mid :: "+mid+"       end :: "+end+"      midval :: "+nums[mid]);
			
			if(mid < end && nums[mid] > nums[mid+1]) {
				return mid;
			}
			if(mid > start && nums[mid] < nums[mid-1]) { 
				return mid -1;
			}
			if(nums[mid] < nums[start]) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
		}
		
		System.out.println("start :: "+start+"     end :: "+end);
		
		return -1;
	}

}
