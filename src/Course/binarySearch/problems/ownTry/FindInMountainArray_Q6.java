package Course.binarySearch.problems.ownTry;

public class FindInMountainArray_Q6 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,3,1};
		//int[] arr = {1,5,2};
		int res = findInMountainArray(2, arr);
		
		System.out.println("res :: "+res);
	}

    public static int findInMountainArray(int target, int[] arr) {
    	
    	int start =0;
    	int end = arr.length-1;
    	
    	while(start < end) {
    		int mid = start + (end-start)/2;
    		System.out.println("start :: "+start+"     mid :: "+mid+"     end :: "+end+"           mid val :: "+arr[mid]);
    		
    		if(arr[mid] > arr[mid+1]){
    			end = mid;
    		}
    		else {
    			start = mid + 1;
    		}

    	}
    	
    	return start;
    }

}
