package Course.binarySearch.problems;

public class FindInMountainArray_Q6 {
	
	public static void main(String[] args) {
		//int[] arr = {1,22,35,65,77,4,3,2,1,0};
		int[] arr = {1,5,2};
		int res = findInMountainArray(2, arr);
		
		System.out.println("res :: "+res);
	}

    public static int findInMountainArray(int target, int[] arr) {
    	
    	int peak = findPeak(arr);
    	int beforePeak = performBinarySearch(arr, target, 0, peak);
    	
    	if(beforePeak != -1)
    		return beforePeak;
    	
    	int afterPeak = performBinarySearchDecreasing(arr, target, peak+1, arr.length-1);
    	
    	if(afterPeak != -1)
    		return afterPeak;
    	
    	return -1;
    }
    
    public static int performBinarySearch(int[] arr, int target, int start, int end) {
 	   
 	   while(start <= end) {
 		   int mid = start + (end - start)/2;
 		   
 		   if(target < arr[mid]) {
 			   end = mid -1;
 		   }
 		   else if(target > arr[mid]) {
 			   start = mid +1;

 		   }
 		   else {
 			   return mid;
 		   }
 	   }
 	   
 	   return -1;
 	}
    
    public static int performBinarySearchDecreasing(int[] arr, int target, int start, int end) {
  	   
  	   while(start <= end) {
  		   int mid = start + (end - start)/2;
  		   
  		   if(target > arr[mid]) {
  			   end = mid -1;
  		   }
  		   else if(target < arr[mid]) {
  			   start = mid +1;

  		   }
  		   else {
  			   return mid;
  		   }
  	   }
  	   
  	   return -1;
  	}
    
  public static int findPeak(int[] arr) {
    	
    	int start =0;
    	int end = arr.length-1;
    	
    	while(start < end) {
    		int mid = start + (end-start)/2;
    		
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
