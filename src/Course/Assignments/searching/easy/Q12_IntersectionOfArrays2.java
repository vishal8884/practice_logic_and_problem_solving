package Course.Assignments.searching.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q12_IntersectionOfArrays2 {

	public static void main(String[] args) {

		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] nums11 = {4,9,5};
		int[] nums22 = {9,4,9,8,4};
		
		int[] res = intersect(nums11, nums22);
		System.out.println("res :: "+Arrays.toString(res));
	}
	
	
	

	public static int[] intersect(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);    //1,1,2,2     //4,5,9
		Arrays.sort(nums2);    //2,2         //4,4,8,9,9
		
		int[] nums2_backup = Arrays.copyOf(nums2,nums2.length);
		
		List<Integer> intersectionList = new ArrayList<>();
		
		for(int num : nums1) {
			int intersectionPos = binarySearch(nums2,num,true);
			
			System.out.println("num :: "+num+"      intersectionPos :: "+intersectionPos+"        nums2 :: "+Arrays.toString(nums2));
			
			if(intersectionPos != -1) {
				intersectionList.add(nums2_backup[intersectionPos]);
			}
		}
		
		System.out.println("intersectionList :: "+intersectionList);
		
		int[] res = new int[intersectionList.size()];
		int x =0;
		
		for(int num : intersectionList) {
			res[x++] = num;
		}
		
		return res;
	}
	
	
	public static int binarySearch(int[] arr, int target,boolean firstOccurance) { // if this is true it will search to left most

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		// 1,2,3,4,5
		while (start <= end) {

			int mid = start + (end - start) / 2;        //1,1,2,3,3,3,3,4,5,6,4

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				if(firstOccurance) {
					end = mid -1;
				}
				else {
					start++;
				}
			}
		}
		if(firstOccurance && ans==0) {                      // if target is at 0 ... we cant replace it with its before...so we can replace it by min value
			arr[ans] = -1;
		}
        if(ans > 0 && firstOccurance && ans !=-1) {         // if we found the target pos.. we are replacing it with the previous value.
		   arr[ans] = arr[ans-1];                           // eg _> 1,1,1,2,3,3,3 ...here we found first 3 at pos 4...so we replace it by 2 (pos - 1 = 4-1 =3) 
        }                                                   //so next time first 3 at pos 5 will be first
		return ans;
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
public static int[] intersectUsingTwoPointer(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);  //4,5,9
		Arrays.sort(nums2);  //4,4,8,9,9
		
		int i=0,j=0;
		List<Integer> common = new ArrayList<>();
		
		while(i< nums1.length && j < nums2.length) {
			
			if(nums1[i] == nums2[j]) {
				common.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i] > nums2[j]) {
				j++;
			}
			else {
				i++;
			}
			System.out.println("i :: "+i+"      j :: "+j);
		}
		
		
		int[] res = new int[common.size()];
		int x=0;
		
		for(int num : common) {
			res[x++] = num;
		}
		
		return res;
	}

}




//public static int[] intersect(int[] nums1, int[] nums2) {
//	Arrays.sort(nums1);    //1,1,2,2     //4,5,9
//	Arrays.sort(nums2);    //2,2         //4,4,8,9,9
//	
//	List<Integer> intersectionList = new ArrayList<>();
//	
//	for(int num : nums1) {
//		int firstOccurance = binarySearch(nums2,num,true);
//		int lastOccurance = binarySearch(nums2,num,false);
//		
//		if(firstOccurance == -1) {
//			continue;
//		}
//		
//		int totalOccurance = (lastOccurance - firstOccurance) + 1;
//		
//
//		
//		System.out.println("num :: "+num+"       firstOccurance :: "+firstOccurance+"       lastOccurance :: "+lastOccurance+"      totalOccurance :: "+totalOccurance);
//	}
//	
//	System.out.println("intersectionList :: "+intersectionList);
//	
//	return null;
//}