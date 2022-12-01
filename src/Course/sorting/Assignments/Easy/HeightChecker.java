package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {

		int[] heights = {1,1,4,2,1,3};
		int res = heightChecker(heights);
		
		System.out.println("res :: "+res);
	}

	public static int heightChecker(int[] heights) {
		int[] newArr = Arrays.copyOf(heights, heights.length);
		int res = 0;
		Arrays.sort(newArr);
		System.out.println(heights.length+"     heights :: "+Arrays.toString(heights));
		System.out.println(newArr.length+"    new :: "+Arrays.toString(newArr));
		
		for(int i=0;i<heights.length;i++) {
			if(heights[i] != newArr[i]) {
				res++;
			}
		}
		
		return res;
	}

}
