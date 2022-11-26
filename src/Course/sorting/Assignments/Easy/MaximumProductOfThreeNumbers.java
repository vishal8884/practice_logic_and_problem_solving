package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		int res = maximumProduct(arr);
		System.out.println("res :: "+res);
	}

	public static int maximumProduct(int[] arr) {
		Arrays.sort(arr);

		int res1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length-3];
		int res2 = arr[0] * arr[1] * arr[arr.length];
		return Math.max(res1,res2);
	}

}
