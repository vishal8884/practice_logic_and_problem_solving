package Course.binarySearch.playaround;

public class SplitArrayLargestSum_try {

	public static void main(String[] args) {

		int[] arr = {7,2,5,10,8};
		int res = findTargetInArray(arr, 24, 2);
		System.out.println("res :: "+res);
	}

	public static int findTargetInArray(int[] arr, int target, int m) {

		int partition = 0;
		int sum = 0, maxSum = 0, prevsum = 0;
		for (int i = 0; i < arr.length; i++) {
			prevsum = sum;
			sum = sum + arr[i];

			if (sum > target) {
				partition++;
				if (sum > maxSum) {
					maxSum = prevsum;
				}
				sum = 0;
				sum = sum + arr[i];
			}
//			else if (sum == target) {
//				sum=0;
//				sum = sum +arr[i];
//			}
			System.out.println("sum :: " + sum + "     prevsum :: " + prevsum + "      maxSum :: " + maxSum);
		}

		if (sum != 0) // one more partition at end which sum < targer
			partition++;
		if (sum > maxSum)
			maxSum = sum;

		System.out.println("total partition :: " + partition + "       maxSum :: " + maxSum);

		if (partition == m && maxSum == target) {
			return 1;
		}

		return -1;
	}

}
