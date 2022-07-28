package Course.binarySearch;

public class OrderAgnosicBinarySearch {

	public static void main(String[] args) {
		int[] arr = {11,10,9,8,7,6,5,4,3,2,1,0};
		
		int res = orderAgnosicBinarySearch(arr,3);
		System.out.println("res :: "+res);
	}
	
	
	public static int orderAgnosicBinarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		boolean isAscending = arr[start] < arr[end];
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			 System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid+"     isAscending :: "+isAscending);
			
			if(isAscending) {
			  if(target == arr[mid]) {
				  return mid;
			  }
			  if(target < arr[mid]) {
				  end = mid -1;
			  }
			  else { //target > arr[mid]   case
				  start = mid+1;
			  }
			}
			
			if(!isAscending) {
				  if(target == arr[mid]) {
					  return mid;
				  }
				  if(target > arr[mid]) {
					  end = mid -1;
				  }
				  else {
					  start = mid+1;
				  }
				}
		}
		
		return -1;
	}

}
