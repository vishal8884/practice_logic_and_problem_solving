package Course.binarySearch.problems.ownTry;

public class SearchInRotatedWithDuplicates_Q9 {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 1, 2 };   //len =7     mid = 7
        findPivotWithDuplicates(arr);
	}

	public static int findPivotWithDuplicates(int[] arr) {

		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] < start) {
				end = mid -1;
			}
			else {
				start = mid +1;      
			}
		}
		return -1;
	}

}
