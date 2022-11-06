package OtherPractice;

public class FloorRoofBinarySerach {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 12, 45, 67, 100};
		int res = binarySearchNextElemIfNotPresent(arr, 13);
		
		System.out.println("res :: "+res);
	}
	
	public static int binarySearchPrevElemIfNotPresent(int[] arr, int target) {

		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > target) {
				end = mid + 1;
			}
			else if(arr[mid] < target) {
				start = mid -1 ;
			}
			else {
				return mid;
			}
		}
		return end;
	}

	public static int binarySearchNextElemIfNotPresent(int[] arr, int target) {

		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > target) {
				end = mid;
			}
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return end;
	}

}
