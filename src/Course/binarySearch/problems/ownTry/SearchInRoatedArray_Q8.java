package Course.binarySearch.problems.ownTry;

public class SearchInRoatedArray_Q8 {

	public static void main(String[] args) {

		int[] arr = {29,31,34,36,38,39,41,45,51,11,12,13,14,15,23,26};    // from 1 again asscending
		int res = search(arr,34);
		System.out.println("res :: "+res);
	}

    public static int search(int[] arr,int target) {
    	
    	int start =0;
    	int end = arr.length-1;
    	int c=0;
    	
 
    	while(start <= end) {
    	  c++;
    	  if(c==100) break;
   		  int mid = start + (end - start)/2;
   	      System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"     midval :: "+arr[mid]+"     startval :: "+arr[start]);
   		   
   		  if(arr[mid] > arr[mid+1]) {
   			  return arr[mid];
   		  }
   		  else if(arr[mid] > arr[start]){
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
