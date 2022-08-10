package Course.Assignments.searching.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q11_IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		int[] nums11 = {1,2};
		int[] nums22 = {1,1};
		
		int[] res = intersection(nums1, nums2);
		System.out.println("res :: "+Arrays.toString(res));
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {         //binary approach

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums1) {
			if(binarySearch(nums2,num)) {
			    set.add(num);
			}
		}
		
		int[] res = new int[set.size()];
		int x =0;
		
		for(int num : set) {
			res[x++] = num; 
		}
		
		System.out.println("set :: "+set);
		
		return res;
	}
	
	public static boolean binarySearch(int[] arr, int target) { // if this is true it will search to left most

		int start = 0;
		int end = arr.length - 1;

		// 1,2,3,4,5
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return true;
			}
		}

		return false;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static int[] intersectionTwoPointerApproach(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);  //4,5,9
		Arrays.sort(nums2);  //4,4,8,9,9
		Set<Integer> set = new HashSet<>();
		
		int i=0,j=0;
		
		while(i < nums1.length && j<nums2.length) {
			
			if(nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i] > nums2[j]) {
				j++;
			}
            else if(nums1[i] < nums2[j]) {
				i++;
			}
		}
		
		System.out.println("set :: "+set);
		int[] res = new int[set.size()];
		int x = 0;
		
		for(int num : set) {
			res[x++] = num;
		}
		
		return res;
	}
	
	
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//public static int[] intersection(int[] nums1, int[] nums2) {
//
//	int[] arr1 = (nums1.length < nums2.length)?nums1:nums2;     //has small arr
//	int[] arr2 = (nums1.length < nums2.length)?nums2:nums1;     // has bigger arr
//	Arrays.sort(arr1);   //4,5,9
//	Arrays.sort(arr2);   //4,4,8,9,9
//    Set<Integer> set  = new HashSet<Integer>();
//	
//	for(int i=0;i<arr1.length;i++) {
//		int a = binarySearch(arr2, arr1[i],true);
//		if(a!=-1)
//		  set.add(arr2[a]);
//	}
//	
//	System.out.println("list :: "+set);
//	
//	int[] res = new int[set.size()];
//	int x=0;
//	
//	List<Integer> collect = set.stream().collect(Collectors.toList());
//	
//	for(int c : collect) {
//		res[x++] = c;
//	}
//	
//	return res;
//}