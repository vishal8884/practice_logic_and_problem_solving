package Course.binarySearch.problems;

public class SearchInRotatedWithDuplicates_Q9 {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 5, 6, 7,7, 8,8,1, 1, 2 };   //len =7     mid = 7
		int[] arr2 = {2,9,2,2,2};
        int res = findPivotWithDuplicates(arr2);
        
        System.out.println("res :: "+res);
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
			if(arr[start] == arr[end] && arr[mid] == arr[start]) {
				
				if(arr[start] > arr[start+1]) {
					return start;
				}
				start ++;
				if(arr[end] < arr[end-1]) {
					return end;
				}
				end --;
			}
		}
		return -1;
	}

}
