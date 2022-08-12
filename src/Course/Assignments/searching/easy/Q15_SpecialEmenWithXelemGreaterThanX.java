package Course.Assignments.searching.easy;

import java.util.Arrays;

public class Q15_SpecialEmenWithXelemGreaterThanX {

	public static void main(String[] args) {

		int[] arr = {3,5};
		int[] arr2 = {0,4,3,0,4};
		int[] arr3 = {3,6,7,7,0};
		int[] arr4 = {1,3,9,5,11,2,11,0,4,2};
		int[] arr5 = {3,9,7,8,3,8,6,6};
		int res = specialArray(arr5);
		System.out.println("res :: "+res);
	}

	public static int specialArray(int[] nums) {

		Arrays.sort(nums); // 0,0,3,4,4     //3, 3, 6, 6, 7, 8, 8, 9
		
		int maxPossibleRes = nums.length;
		int minPossibleRes = 1;  // 0 or else first non 0 number
		int c = 0;

		System.out.println("minPossibleRes :: "+minPossibleRes+"       maxPossibleRes :: "+maxPossibleRes+"       sortednums :: "+Arrays.toString(nums));
		System.out.println();
		
		for(int i=minPossibleRes;i<=maxPossibleRes;i++) {
			

			int pos = binarySearch(nums, i);
			if(pos == -1){
				System.out.println("i :: "+i+"     pos :: "+pos);
				continue;
			}
			
			int no_of_next_elems = nums.length - pos;
			
			if(no_of_next_elems == i) {
				return i;
			}
			if(no_of_next_elems > i) {
				continue;
			}
			
			System.out.println("i :: "+i+"     pos :: "+pos+"     no_of_next_elems :: "+no_of_next_elems);
		}
		
		
		return -1;
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
	
	///////////////////////////////////////////Linear approach//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static int specialArrayLinear(int[] nums) {  //linear 2ms 41 mb working

		Arrays.sort(nums); // 0,0,3,4,4     //0, 1, 2, 2, 3, 4, 5, 9, 11, 11
		
		
		int maxPossibleRes = nums.length;
		int minPossibleRes = 1;  // 0 or else first non 0 number
		int c = 0;

		System.out.println("minPossibleRes :: "+minPossibleRes+"       maxPossibleRes :: "+maxPossibleRes+"       sortednums :: "+Arrays.toString(nums));
		System.out.println();
		
		for(int i=minPossibleRes;i<=maxPossibleRes;i++) {
			c=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j] >= i) {
					c++;
				}
				if(c > i) {
					c=0;
					break;
				}
				System.out.println("i :: "+i+"        j :: "+j+"       nums[j] :: "+nums[j]+"      c :: "+c);
			}
			
			if(c == i) {
				return c;
			}

			System.out.println();
		}
		
		
		return -1;
	}

}




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public static int specialArray(int[] nums) {

		Arrays.sort(nums); // 0,0,3,4,4
		
		int maxPossibleRes = nums.length;
		int minPossibleRes = 0;
		int minPossibleResIndex = 0;
		int c = 0;
		
		for(int i =0; i <nums.length;i++) {
			if(nums[i]!=0) {
				minPossibleRes =nums[i];
				minPossibleResIndex = i;
				break;
			}
		}
		
		for(int i=minPossibleRes;i<=maxPossibleRes;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[j] >= i) {
					c++;
				}
			}
		}
		
		System.out.println("minPossibleRes :: "+minPossibleRes+"       maxPossibleRes :: "+maxPossibleRes);
		
		return -1;
	}
*/