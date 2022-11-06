package Course.binarySearch.problems;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastPositionBinary_Q4 {

	public static void main(String[] args) {

		int[] nums = {1,1,1,2,2,2,2,3,4,5,7,8,8,11,23};   //1,2,3,4,2,5,7
		int[] res = searchRangeBinary(nums, 2);
		
		System.out.println("res :: "+Arrays.toString(res));
	}
	

	public static int[] searchRangeBinary(int[] nums, int target) {
		int[] res = {-1,-1};
	
		int firstOccur = performBinarySearch(nums, target, true);
		System.out.println();
		int lastOccur = performBinarySearch(nums, target, false);
		
		res[0] = firstOccur;
		res[1] = lastOccur;
		
		return res;
	}
	
	public static int performBinarySearch(int[] arr, int target, boolean firstTime) { // firsttime = true if we want to find first occurance (left most)

		   int ans = -1;
		   int start = 0;
		   int end = arr.length-1;
		   
		   while(start <= end) {
			   int mid = start + (end - start)/2;
			   System.out.println("start :: "+start+"      mid :: "+mid+"      end :: "+end+"            midval :: "+arr[mid]+"         firstTime :: "+firstTime+"           ans :: "+ans);
			   
			   if(target < arr[mid]) {
				   end = mid -1;
			   }
			   else if(target > arr[mid]) {
				   start = mid +1;
			   }
			   else {
				   ans = mid;
				   if(firstTime) {
					   end = mid -1;   // checks if any other target left to the current obtained target
				   }
				   else {
					   start = mid +1;    // checks if any other target right to the current obtained targer
				   }
			   }
		   }
		   
		   return ans;
		}

}
