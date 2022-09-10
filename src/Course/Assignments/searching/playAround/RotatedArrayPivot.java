package Course.Assignments.searching.playAround;

public class RotatedArrayPivot {

	public static void main(String[] args) {

		int[] arr = {10,13,2,3,5,6,8,9};
		int[] arr2 = {10,1,10,10,10};
		int[] arr3 = {3,3,3,1};
		int res = findPivot_min(arr3);
		System.out.println("res :: "+res);
	}

	public static int findPivot_min(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end- start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"        mid val :: "+arr[mid]);
			
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid+1;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid;
			}

			if(arr[mid] < arr[start]) {
				end = mid -1;
			}
			else if(arr[mid] > arr[start]){ 
				start = mid + 1;
			}
			else {
				end --;
			}
		}
		
		return -1;
	}
}
