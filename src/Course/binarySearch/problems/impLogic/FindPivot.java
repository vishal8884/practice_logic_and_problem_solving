package Course.binarySearch.problems.impLogic;

public class FindPivot {

	public static void main(String[] args) {
		int[] arr = {23,35,10,12,13,18,20};  //len=7     mid = 3       // 10, 12, 13, 18, 20, 23, 35
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
			if(arr[mid] <= arr[start]) {           // start elem is greater than mid so we can eliminate mid along with its right
				end = mid -1;
			}
			else {                                 // start elem is less than mid so max elem is present to its right
				start = mid +1;
			}
		 }
	  	   
	  	   return -1;
	   }

}
