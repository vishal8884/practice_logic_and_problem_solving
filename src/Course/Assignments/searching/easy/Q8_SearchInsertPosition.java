package Course.Assignments.searching.easy;

public class Q8_SearchInsertPosition {

	public static void main(String[] args) {

		int[] arr = {1,3,5,6};
		int res = searchInsert(arr,2);
		System.out.println("res :: "+res);
	}
	
	
	public static int searchInsert(int[] arr, int target) {              // naive approach linear search

		int start = 0;
		int end = arr.length -1;
		
		while(start<=end) {
			
			int mid = start + (end -start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"     end :: "+end);
			
			if(target == arr[mid]) {
				return mid;
			}
			if(target > arr[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		}
		System.out.println("start :: "+start+"     end :: "+end);
		return start;
	}
	
	
	/////////////////////////////LInaer approach ////////////////////////////////////////////////////////////

	public static int searchInsert2(int[] arr, int target) {              // naive approach linear search

		for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
            	return i;
            }
            if(arr[i] > target) {
            	return i;
            }
		}
		return arr.length;
	}

}
