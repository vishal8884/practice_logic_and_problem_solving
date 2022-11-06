package Course.binarySearch.problems;

public class NearestNuberToTarget_Ceiling_Q1 {

	public static void main(String[] args) {
		int[] arr = {2,3,8,13,60,77,83};
		
		int res = nearestGreaterBinarySearch_Ceiling(arr, 14);   //65
		System.out.println("res :: "+res);
	}
	//question --> find the target or number greater than target by min
	
	public static int nearestGreaterBinarySearch_Ceiling(int[] arr, int target) {
		
		if(target > arr[arr.length-1]) {
			return -1;
		 }
		
		   int start = 0;
		   int end = arr.length-1;
		   
		   while(start <= end) {
			   int mid = start + (end - start)/2;
			   System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid+"     mid val :: "+arr[mid]);
			   
			   
			   if(target < arr[mid]) {             //when start == end in this loop we need to check if this if loop is called or next one
				   end = mid -1;
			   }
			   else if(target > arr[mid]) {
				   start = mid +1;
			   }
			   else {
				   return mid;
			   }
			   
		   }
		   return start;
	}
}
