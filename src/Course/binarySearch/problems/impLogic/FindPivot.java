package Course.binarySearch.problems.impLogic;

public class FindPivot {

	public static void main(String[] args) {
		int[] arr = {23,35,10,12,13,18,20};  //len=7     mid = 3       // 10, 12, 13, 18, 20, 23, 35        
		// int[] arr = {4,5,6,7,8,1,2}; 
		int res =findPivotInRotatedArray(arr);
		System.out.println("res :: "+res);
	}
	
	public static int findPivotInRotatedArray(int[] arr) {
		  
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
			if(arr[mid] <= arr[start]) {           // mid elem is less than start....so this(cause its caught at first if this is the one) and its right cant be the max ..ie pivot
				end = mid -1;                      // works with arr[mid] < arrp[start] for no duplicates
 			}
			else {                                 // mid elem is greater than start....so this and its left cant be the one
				start = mid +1;
			}
		 }
	  	   
	  	   return -1;
	   }

}
