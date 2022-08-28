package Course.Assignments.searching.playAround;

import java.util.Arrays;

public class Snippet {

	public static void main(String[] args) {
		int res = binarySearchNearstNum(new int[] {1,7,4},3);
		System.out.println("res :: "+res);
	}

	public static int binarySearchNearstNum(int[] arr, int num) {

		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length - 1;
		int c =0;
		int ans = -1;

		while (start <= end) {
			c++; if(c==20) break;
			
			int mid = start + (end - start) / 2;
			System.out.println("start :: " + start + "     mid :: " + mid + "         end :: " + end+"       midval :: " + arr[mid]);

			if (num < arr[mid]) {
				end = mid-1;
			} 
			else if(num > arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		
		
		int startDiff = Math.abs(arr[start] - num);
		int endDiff = Math.abs(arr[end] - num);
		
		System.out.println("arr[start] :: "+arr[start]+"    arr[end] :: "+arr[end]+"       ans :: "+ans+"         startDiff :: "+startDiff+"     endDiff :: "+endDiff);
		
		if(startDiff < endDiff) {
			return arr[start];
		}
		
		return arr[end];
	}
}
