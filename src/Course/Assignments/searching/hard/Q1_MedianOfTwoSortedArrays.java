package Course.Assignments.searching.hard;

import java.util.Arrays;

public class Q1_MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = {1,3,5,7,8,10,13};
		int[] arr2 = {2,4};
		
		double res = findMedianSortedArrays(arr1, arr2);
		System.out.println("res :: "+res);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {          //naive approach

		int nums3[] = new int[nums1.length+nums2.length];
		
		for(int i=0;i<nums2.length;i++) {
			
			int start = 0;
			int end = nums1.length - 1;
			int target = nums2[i];
			
			while(start <= end) {
				int mid = start + (end - start)/2;
				System.out.println("start :: "+start+"      mid :: "+mid+"     end :: "+end+"     midval :: "+nums1[mid]);
				
				if(nums1[mid] > target) {
					end = mid - 1;
				}
				else if(nums1[mid] < target) {
					start = mid + 1;
				}
			}
			
		}
		
		return -1;
	}
	
	
	public static int performBinarySearch(int[] arr, int target) {

		   int start = 0;
		   int end = arr.length-1;
		   
		   while(start <= end) {
			   int mid = start + (end - start)/2;
			   System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"     midval :: "+arr[mid]);
			   
			   if(target < arr[mid]) {
				   end = mid -1;
			   }                                   
			   else if(target > arr[mid]) {        
				   start = mid +1;

			   }
			   else {
				   return mid;
			   }
		   }
		   return -1;
		}
	
	
	//--------------------------------|NAIVE APPRAOCH|-----------------------------------------------------------------------------------------
	
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {          //naive approach

		int[] nums3 = new int[nums1.length+nums2.length];
		int x=0;
		
		for(int i : nums1) {
			nums3[x] = i;
			x++;
		}
		for(int j : nums2) {
			nums3[x] = j;
			x++;
		}
		Arrays.sort(nums3);
		System.out.println("nums3 :: "+Arrays.toString(nums3));
		
		if(nums3.length%2 !=0) {
			return nums3[nums3.length/2];
		}
		
		double n1 = nums3[nums3.length/2];
		double n2 = nums3[(nums3.length/2) -1];
		
		
		
		return (n1+n2)/2;
	}
}
