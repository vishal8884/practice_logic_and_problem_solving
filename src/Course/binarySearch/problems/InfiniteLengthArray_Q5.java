package Course.binarySearch.problems;

public class InfiniteLengthArray_Q5 {

	public static void main(String[] args) {

		int[] arr = {3,5,7,9,10,90,100,130,140,160,170,330,367,400};
		int res = infiniteBinarySearch(arr,330);
		
		System.out.println("res :: "+res);
		
	}
	
	public static int infiniteBinarySearch(int[] arr,int target) {
		
		int start =0;
		int end =1;
		System.out.println("start :: "+start+"     end :: "+end);
		
		while(target > arr[end]) {
			int tempStart = end +1;               
			end = end + (end-start+1)*2;    // increating array index like    0 1     2 5     6 13 ......
			start = tempStart;
			System.out.println("start :: "+start+"     end :: "+end);
		}
		
		return performBinarySearch(arr, target, start, end);       // this takes start as 6 and end as 13 and performs binary search
	}

	public static int performBinarySearch(int[] arr, int target,int start,int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;

			} else {
				return mid;
			}
		}

		return -1;
	}

}
