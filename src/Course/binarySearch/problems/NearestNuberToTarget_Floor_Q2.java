package Course.binarySearch.problems;

public class NearestNuberToTarget_Floor_Q2 {

	public static void main(String[] args) {
		int[] arr = {2,3,8,13,60,77,83};
		
		int res = nearestLesserBinarySearch_Floor(arr, -5);   //65
		System.out.println("res :: "+res);
	}
	
	//question --> find the target or number less than target by min
	
	public static int nearestLesserBinarySearch_Floor(int[] arr, int target) {
		

		   int start = 0;
		   int end = arr.length-1;
		   
		   while(start <= end) {
			   int mid = start + (end - start)/2;
			   System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid+"     mid val :: "+arr[mid]);
			   
			   if(target == arr[mid])
				   return mid;
			   if(target < arr[mid]) {
				   end = mid -1;
			   }
			   else if(target > arr[mid]) {
				   start = mid +1;
			   }
			   
		   }
		   
		   return end;
	}
}
