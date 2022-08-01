package Course.binarySearch.problems;

public class SearchInRoatedArray_Q8 {

	public static void main(String[] args) {
                   //s                    m                        e
		//int[] arr = {29,31,34,36,38,39,41,45,51,11,12,13,14,15,23,26};    // from 51 again asscending
		int[] arr = {3,5,1};
		//int res = findPivot(arr);
		int res = search(arr, 3);
		System.out.println("res :: "+res);
	}

    public static int search(int[] arr,int target) {
    	
    	int pivot = findPivot(arr);
    	
    	if(pivot == -1) {   //here no pivot so array not rotated
    		return performBinarySearch(arr, target, 0, arr.length-1);              
    	}
    	if(arr[pivot] == target) {                         //we can also do similar to mountain problem
    		return pivot;                                  
    	}
    	if(target >= arr[0]) {
    		return performBinarySearch(arr,target,0,pivot-1);
    	}
    	
    	return performBinarySearch(arr, target, pivot+1, arr.length-1);
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
    
   public static int findPivot(int[] arr) {
	  
	   int start =0;
	   int end = arr.length-1;
	   
	   while(start<=end) {
		   int mid = start + (end - start)/2;
		   System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"        mid val :: "+arr[mid]);
		   
		   if(mid < end &&  arr[mid] > arr[mid+1]) {
			   return mid;
		   }
		   if(mid > start && arr[mid] < arr[mid-1]) {
			   return mid -1;
		   }
		   if(arr[mid] <= arr[start]) {
			   end = mid -1;
		   }
		   else {
			   start = mid +1;
		   }
	   }
  	   
  	   return -1;
   }
    
    
    
    
    
    
   /////////////////////////////////////////////////////////////////////////////////// 
   public static int searchBruteForce(int[] arr,int target) {
    	
    	for(int i =0;i<arr.length;i++) {
    		if(target == arr[i]) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
    
    
    
}






/*
public static int findPivot(int[] arr) {
int start =0;
int end = arr.length-1;

   while(start <= end) {
	    int mid = start + (end - start)/2;
       System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"     midval :: "+arr[mid]+"     startval :: "+arr[start]);
	   
	    if(mid < end && arr[mid] > arr[mid+1]) {
		  return arr[mid];
	    }
	    if(mid > start && arr[mid] < arr[mid -1]){
		  return mid -1;
	    }
	    if(arr[mid] <= arr[start]) {
	    	end = mid -1;
	    }
	    else {   //arr[mid] > arr[start]
	    	start = mid +1;
	    }

   }
  
  return -1;
}
*/