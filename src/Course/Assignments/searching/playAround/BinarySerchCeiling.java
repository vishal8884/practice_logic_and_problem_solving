package Course.Assignments.searching.playAround;

public class BinarySerchCeiling {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		int res = binarySearchCieling(arr,3);
		
		System.out.println("res :: "+res);
	}
	
	
	public static int binarySearchCieling(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end -start)/2;
			System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid+"     mid val :: "+arr[mid]);
			
			if(arr[mid] > target) {
				start = mid + 1;
			}
			else if(arr[mid] < target) {
				end = mid - 1;
			}
			else {
				return mid;
			}
		}
		
		System.out.println("start :: "+start+"    end :: "+end);
		
		if(start > arr.length-1)
			return -1;
		
		return start;
	}

}
