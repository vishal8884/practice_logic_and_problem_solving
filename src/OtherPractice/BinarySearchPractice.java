package OtherPractice;

public class BinarySearchPractice {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 12, 45, 67, 100};
		int res = binarySearch(arr, 67);
		
		System.out.println("res :: "+res);
	}

	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > target) {
				end = mid-1;
			}
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
