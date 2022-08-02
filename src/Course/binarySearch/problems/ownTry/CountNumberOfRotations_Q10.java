package Course.binarySearch.problems.ownTry;

public class CountNumberOfRotations_Q10 {

	public static void main(String[] args) {

		int[] arr = {4,5,6,7,0,1,2};  //1,2,3,4,5
		int res =findNumberOfRotationsInArray(arr);
		System.out.println("res :: "+res);
	}
	
	public static int findNumberOfRotationsInArray(int[] arr) {
		
		int pivot = getPivotInRotatedArray(arr);
		

        return pivot+1;
	}
	
   public static int getPivotInRotatedArray(int[] arr) {
		
		int start = 0; //just iterate from start to end...will think of logic
		int end = arr.length-1;
		
        while(start<=end) {
        	int mid = start + (end - start)/2;
        	System.out.println("start :: "+start+"      mid :: "+mid+"      end :: "+end+"      midval :: "+arr[mid]);
        	
        	if(mid<end && arr[mid] > arr[mid+1]) {
        		return mid;
        	}
        	if(mid>start && arr[mid] < arr[mid-1]) {
        		return mid-1;
        	}
        	if(arr[mid] < arr[start]) {
        		end = mid -1;
        	}
        	else {
        		start = mid +1;
        	}
        }
		
        return -1;
	}

}
