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
		
		int[] res = intersection(nums11, nums22);
		System.out.println("res :: "+Arrays.toString(res));
		
//		int[] arr = {1,4,13,15,16,22};
//		int res = binarySearch(arr,17, 0, arr.length-1);
//		System.out.println("res :: "+res);
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		int[] arr1 = (nums1.length < nums2.length)?nums1:nums2;     //has small arr
		int[] arr2 = (nums1.length < nums2.length)?nums2:nums1;     // has bigger arr
		Arrays.sort(arr1);   //4,5,9
		Arrays.sort(arr2);   //4,4,8,9,9
        Set<Integer> set  = new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			int a = binarySearch(arr2, arr1[i],true);
			if(a!=-1)
			  set.add(arr2[a]);
		}
		
		System.out.println("list :: "+set);
		
		int[] res = new int[set.size()];
		int x=0;
		
		List<Integer> collect = set.stream().collect(Collectors.toList());
		
		for(int c : collect) {
			res[x++] = c;
		}
		
		return res;
	}
	
	public static int binarySearch(int[] arr, int target,boolean firstTime) { // if this is true it will search to left most

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		// 1,2,3,4,5
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				if(firstTime) {               //this will test the first occurance of target
					end = mid - 1;
				}
				else {                        //this will check last occurance of target
					start = mid +1;
				}
			}
		}

		return ans;
	}

}
