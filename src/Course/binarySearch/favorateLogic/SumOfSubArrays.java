package Course.binarySearch.favorateLogic;

public class SumOfSubArrays {

	public static void main(String[] args) {

		int[] arr = {1,2,3}; 
		
		long res = SubArraySum(arr,arr.length);
		System.out.println("res :: "+res);
	}

	public static long SubArraySum(int arr[], int n) {
		long result = 0, temp = 0;

		// Pick starting point
		for (int i = 0; i < n; i++) {
			// Pick ending point
			temp = 0;
			for (int j = i; j < n; j++) {
				// sum subarray between current
				// starting and ending points
				temp += arr[j];
				result += temp;
				
				System.out.println("i :: "+i+"     j :: "+j+"        arr[j] :: "+arr[j]+"      temp :: "+temp+"      result :: "+result);
			}
		}
		return result;
	}

}
