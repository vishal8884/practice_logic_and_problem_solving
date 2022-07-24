package Course.Recursion.day2;

public class CheckIfStrictlyncreasing {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		boolean isSorted = checkIfSorted(arr,1,0);
		System.out.println("isSorted :: "+isSorted);
		
	}
	
	public static boolean checkIfSorted(int[] arr, int curr, int prev) {
		
		if(curr == arr.length-1) {
			return true;
		}
		
		if(arr[prev]+1 != arr[curr]) {
			return false;
		}
		
		boolean checkIfSorted = checkIfSorted(arr, curr+1, prev+1);
	
		return checkIfSorted;
	}

}
