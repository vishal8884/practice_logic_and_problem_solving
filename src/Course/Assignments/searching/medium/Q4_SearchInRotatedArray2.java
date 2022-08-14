package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q4_SearchInRotatedArray2 {  //with dublicates

	public static void main(String[] args) {

		int[] arr = {2,5,6,0,0,1,2};
		int[] arr2 = {1,0,1,1,1};
		boolean res = search(arr2,0);
		System.out.println("res :: "+res);
	}
	
	 public static boolean search(int[] nums, int target) {
		 Arrays.sort(nums);
		 int pivot = findPivot(nums);
		 if(pivot == -1) {
			 return binarySearch(nums,target,0,nums.length-1);
		 }
		 
		 boolean a = binarySearch(nums, target, 0,pivot);
		 boolean b = binarySearch(nums, target, pivot+1,nums.length-1);
		 
		 if(!a && !b)
		   return false;
		 
		 return true;
	 }
	 //1,2,3,4,5
	 public static boolean binarySearch(int[] arr,int target,int start,int end) {
		 
		 while(start <= end) {
			 int mid = start + (end - start)/2;
			 if(target > arr[mid]) {
				 start = mid + 1;
			 }
			 else if(target < arr[mid]) {
				 end = mid -1;
			 }
			 else {
				 return true;
			 }
		 }
		 
		 return false;
	 }
	
	 public static int findPivot(int[] arr) {  //1,0,1,1,1  //2,5,6,7,8,1,2
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"        end :: "+end+"        midval :: "+arr[mid]);
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid> start && arr[mid] < arr[mid-1]) {
				return mid - 1;
			}
			if(arr[mid] > start) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return -1;
	}

}
