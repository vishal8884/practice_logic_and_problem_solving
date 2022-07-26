package Course.binarySearch.problems.ownTry;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastPositionBinaryLOGN {

	public static void main(String[] args) {

		int[] nums = {1,1,1,2,2,2,2,3,4,5,7,8,8,11,23};   //1,2,3,4,2,5,7
		int[] res = searchRangeBinary(nums, 2);
		
		System.out.println("res :: "+Arrays.toString(res));
	}
	

	public static int[] searchRangeBinary(int[] nums, int target) {             //PERFORMS BINARY SEARCH inside binary search so O(logN)
		int[] res = {-1,-1};
	
		int start = performBinarySearch(nums, target, true);
		System.out.println();
		int end = performBinarySearch(nums, target, false);
		
		res[0] = start;
		res[1] = end;
		
		return res;
	}
	
	public static int performBinarySearch(int[] arr, int target, boolean firstTime) {

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
					   end = mid -1;
				   }
				   else {
					   start = mid +1;
				   }
			   }
		   }
		   
		   return ans;
		}

}
