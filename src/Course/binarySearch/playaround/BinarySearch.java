package Course.binarySearch.playaround;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {1,5,2};
		int pos = performBinarySearch(arr,2);
		
		System.out.println("pos :: "+pos);
	}
	
   public static int performBinarySearch(int[] arr, int target) {

	   int start = 0;
	   int end = arr.length-1;
	   
	   while(start <= end) {
		   int mid = start + (end - start)/2;
		   System.out.println("start :: "+start+"     mid :: "+mid+"     end :: "+end+"    midval :: "+arr[mid]);
		   
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



    ////////////////////below is my own code//////////////////////////////////////////////////////////////////////
	
	public static int performBinarySearchOwn(int[] arr, int target) {
		
		if(arr.length==1) {
			return arr[0];
		}
		int midIndex = arr.length/2;
		int midElem = arr[midIndex];
		boolean less = target<midElem;
		
		if(midElem == target)
			return midIndex;
		
		if(less) {
			for(int i=0;i<midIndex;i++) {
				if(arr[i] == target)
					return i;
			}
		}
		else {
			for(int i=midIndex+1;i<arr.length;i++) {
				if(arr[i] == target)
					return i;
			}
		}
		
		return -1;
	}

}





//public static int performBinarySearch(int[] arr, int target) {
//	
//	   int start =0;
//	   int end = arr.length-1;
//	   
//	   while(start <= end) {
//		   
//		   int mid = start+ (end-start) / 2;
//		   System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid);
//		   if(target< arr[mid]) {
//			   end = mid -1;
//		   }
//		   else if(target > arr[mid]) {
//			   start = mid + 1;
//		   }
//		   else {
//			   return mid;
//		   }
//	   }
//	   
//	   
//	   return -1;
//	}
