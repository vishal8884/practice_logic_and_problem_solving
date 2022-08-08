package Course.Assignments.searching.easy.playaround;

public class BinarySearchWithDuplicates {

	public static void main(String[] args) {

		int[] arr = {1,1,2,4,4,4,5,6,7,8,8,10,13,15,15};
		int[] arr2 = {4,4,8,9,9};
		int res = binarySearch(arr2,4);
		
		System.out.println("res :: "+res);
	}

	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		boolean firstTime = true;  // if this is true it will search to left most
		int ans = -1;

		// 1,2,3,4,5
		while (start <= end) {

			int mid = start + (end - start) / 2;
			System.out.println("start :: "+start+"       mid :: "+mid+"         end :: "+end+"       midval :: "+arr[mid]);

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				if(firstTime) {               //this will test the first occurance of target
					end = mid - 1;
				}
				else {                        //this will check last occurance of target
					start = mid +1;
				}
			}
		}

		
		return ans;
	}

}
