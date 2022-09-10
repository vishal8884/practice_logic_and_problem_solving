package Course.Assignments.searching.hard;

public class Q2_MinInRotatedArray2 {

	public static void main(String[] args) {

		int[] arr = {4, 5, 6, 7, 0, 1, 4};
		int[] arr2= {1,3,5};
		int[] arr3 = {2,2,2,0,1};
		int[] arr4 = {3,3,3,1}; 
		int res = findMin(arr4);
		
		System.out.println("res :: "+res);
	}
	
	public static int findMin(int[] nums) {
		int pivot = findPivot_min(nums);

		System.out.println("pivot :: "+pivot);
		
		if(pivot == -1) {
			return nums[0];
		}
		else {
			return nums[pivot];
		}
	}

    public static int findPivot_min(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end- start)/2;
			//System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"        mid val :: "+arr[mid]);
			
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid+1;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid;
			}
			if(arr[mid] <= arr[start]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
