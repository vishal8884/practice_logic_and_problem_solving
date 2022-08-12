package Course.Assignments.searching.easy.playaround;

public class NoOfelemGreaterThanTrget {

	public static void main(String[] args) {

		int[] arr = {1,4,4,4,12,14,20,24};
		int res = binarySearchFirstOrLast(arr, 4, false);
		System.out.println("res :: "+res);
		
	}
	
	public static int binarySearchFirstOrLast(int[] nums,int target, boolean first) {
		int start = 0;
		int end = nums.length -1;
		int ans = 0;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target > nums[mid]) {
				start = mid + 1;
			}
			else if(target < nums[mid]) {
				end = mid -1;
			}
			else {
				ans = mid;
				if(first)
				    end = mid -1;
				else
					start = mid + 1;
			}
		}
		return ans;
	}
	
	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else  if(arr[mid] < target){
				start = mid + 1;
			}
			else {
				ans = mid;
				end = mid -1;
			}
		}

		if(ans != -1) {
			return ans;
		}
		return start;
	}

	public static int binarySearch2(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				ans = mid;
				end = mid - 1;
			}
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		
		return (ans == -1)?start:ans;
	}

}
