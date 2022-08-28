package Course.Assignments.searching.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/minimum-absolute-sum-difference/
public class Q11_MinAbsSumDiff {

	public static void main(String[] args) {

		int[] nums1 = {1,10,4,4,2,7};
		int[] nums2 = {9,3, 5,1,7,4};
		
		int[] nums1a = {1,28,21};
		int[] nums2a = {9,21,20};
		
		int[] nums1b = {2,4,6,8,10};
		int[] nums2b = {2,4,6,8,10};
		
		int[] nums1c = {1,7,5};
		int[] nums2c = {2,3,5};
		
		int[] nums1d = {5,2,7};
		int[] nums2d = {10,7,12};
		
		int res = minAbsoluteSumDiff(nums1d,nums2d);
		
		System.out.println("res :: "+res);
	}

	public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {      //nums1 = {1,7,5}    nums2 = {2,3,5}
		
		int len = nums1.length;
		int mod = (int)1e9+7;
		int[] maxAbsDiff = {Integer.MIN_VALUE,Integer.MIN_VALUE};
		int i_val = 0;
		int counter = 0;
		
		int sum = findAbsDiffSum_andStoreInArr(i_val,len, nums1, nums2, maxAbsDiff);
		
		//find nearest number to nums2[num2pos] in nums1 (excluding nums1[nums2pos]
		int nearestNum = findNearestNumber(nums1,nums2[maxAbsDiff[1]]);
		
		System.out.println("nums1 :: "+Arrays.toString(nums1));
		System.out.println("nums2 :: "+Arrays.toString(nums2)); System.out.println();
		
		System.out.println("maxAbsDiff :: "+maxAbsDiff[0]+"     maxAbsDiffPos :: "+maxAbsDiff[1]+"     nearestNum :: "+nearestNum+"       sum :: "+sum);
		System.out.println();
		
		//check if nearest number is in diff pos
		if(nearestNum != nums1[maxAbsDiff[1]]) {
			System.out.println("condition satified as we already found the nearesrt to it other than in same pos");
			int res = getRes(sum, maxAbsDiff, nums1, nums2, nearestNum, mod);
			
			return res;
		}
		else {
			System.out.println("already nums2[pos] is nearest to nums1[pos].....so need to find next nearest      i_val :: "+i_val); System.out.println();
			maxAbsDiff[0] = Integer.MIN_VALUE;
			maxAbsDiff[1] = Integer.MAX_VALUE;
			
			while(true) {
			   counter++;
			   i_val++;
			   findAbsDiffSum_andStoreInArr(i_val, len, nums1, nums2, maxAbsDiff);
			   nearestNum = findNearestNumber(nums1,nums2[maxAbsDiff[1]]);
			
			   System.out.println("maxAbsDiff :: "+maxAbsDiff[0]+"     maxAbsDiffPos :: "+maxAbsDiff[1]+"     nearestNum :: "+nearestNum+"       sum :: "+sum+"    counter :: "+counter);
			   
			   if(nearestNum != nums1[maxAbsDiff[1]]) {
				    return getRes(sum, maxAbsDiff, nums1, nums2, nearestNum, mod);
			   }
			   else if(counter == nums1.length) {
				   return 0;
			   }
			   else {
				   i_val++;
			   }
			}
			
		}
		
	//	return -1;
		
	}
	
	
	public static int getRes(int sum,int[] maxAbsDiff,int[] nums1,int[] nums2,int nearestNum,int mod) {
		
		int res = ((sum - (Math.abs(nums1[maxAbsDiff[1]]-nums2[maxAbsDiff[1]])))+(Math.abs(nearestNum - nums2[maxAbsDiff[1]])))%mod;
		return res;
	}
	
	public static int findAbsDiffSum_andStoreInArr(int i_val, int len, int[] nums1, int[] nums2,int[] maxAbsDiff) {   //maxAbsDiff[0] = elem   maxAbsDiff[1] = pos
		int sum = 0;
		
		for(int i=i_val;i<len;i++) {
	           int absDiff = Math.abs(nums1[i]-nums2[i]); 
	           
	         //  System.out.println("i_val :: "+i_val+"  i :: "+i+"     absDiff :: "+absDiff);
	           
	           sum = sum + absDiff;
	           if(absDiff >= maxAbsDiff[0]) {
	        	   maxAbsDiff[0] = absDiff;
	        	   maxAbsDiff[1] = i;
	           }
			}
		
		return sum;
	}
	
	public static int findNearestNumber(int[] arr,int num) {
		
		int nearest_diff_elem_num = Integer.MAX_VALUE;
		int nearestNum = Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==num) {
				return arr[i];
			}
			if(Math.abs(arr[i]-num) < nearest_diff_elem_num) {
				nearestNum = arr[i];
				nearest_diff_elem_num = Math.abs(arr[i]-num);
			}
			
			//System.out.println("arr[i] :: "+arr[i]+"    num :: "+num+"      nearest_diff_elem_num :: "+nearest_diff_elem_num+"    nearestNum :: "+nearestNum+"      Math.abs(arr[i]-num) :: "+Math.abs(arr[i]-num));
		}
		
		
		return nearestNum;
	}

}


/*
 * public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {      //nums1 = {1,7,5}    nums2 = {2,3,5}

		int len = nums1.length;
		int sum = 0;
		int mod = (int)1e9+7;
		int maxAbsDiff = Integer.MIN_VALUE;
		List<Integer> maxAbsDiffList = new ArrayList<>();
		List<Integer> maxAbsDiffListPos = new ArrayList<>();
		
		for(int i=0;i<len;i++) {
           int absDiff = Math.abs(nums1[i]-nums2[i]); 
           sum = sum + absDiff;
           if(absDiff > maxAbsDiff) {
        	   maxAbsDiff = absDiff;
        	   maxAbsDiffList.add(maxAbsDiff);
        	   maxAbsDiffListPos.add(i);
        	   maxAbsDiff =Integer.MIN_VALUE;
           }
		}
		
		//find nearest number to nums2[num2pos] in nums1 (excluding nums1[nums2pos]
		int x =0;
		int nearestNum = findNearestNumber(nums1,nums2[maxAbsDiffListPos.get(x)]);
		int finalNearestNum = nearestNum;
		int finalReplacePos = 0;
		int c =0;
		
		System.out.println("nums1 :: "+Arrays.toString(nums1));
		System.out.println("nums2 :: "+Arrays.toString(nums2)); System.out.println();
		System.out.println("maxAbsDiff List :: "+maxAbsDiffList+"     maxAbsDiffListPos :: "+maxAbsDiffListPos); System.out.println();
		System.out.println("sum :: "+sum+"     nums2[pos] :: "+nums2[0]+"      nearestNum :: "+nearestNum);
		
		
		if(nearestNum == nums1[maxAbsDiffListPos.get(x)]) {
			while(true) {
				if(x+1 < maxAbsDiffListPos.size()) {
					c++; if(c==nums1.length) break;
					nearestNum = findNearestNumber(nums1,nums2[maxAbsDiffListPos.get(x+1)]);
					
					System.out.println("nearst num :: "+nearestNum);
					
					if(nearestNum != nums1[maxAbsDiffListPos.get(x+1)]) {
						finalNearestNum = nearestNum;
						finalReplacePos = x+1;
						break;
					}
					
				}
				else {
					return 0;
				}
			}
		}
		
		sum =0;
		
		System.out.println("final replace pos :: "+finalReplacePos+"     finalNearestSum :: "+finalNearestNum);
		
		if(finalNearestNum == 0)
			return 0;
		
		for(int i =0; i<nums1.length;i++) {
			if(i == finalReplacePos) {
				nums1[i] = finalNearestNum;
			}
			sum = (sum + Math.abs(nums1[i]-nums2[i]))%mod;
		}
		
		return sum;
		
	}
 */


/*
 * 
 * APPROACH 2 --> somewhat working need to enhance
 
 public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {      //nums1 = {1,7,5}    nums2 = {2,3,5}

		int len = nums1.length;
		int sum = 0;
		int mod = (int)1e9+7;
		int maxAbsDiff = Integer.MIN_VALUE;
		int num2pos = -1; // pos whre we need to update nums[i] as here the sum is max......we can find nearest number to nums2[nums2pos] in nums1
		
		for(int i=0;i<len;i++) {
           int absDiff = Math.abs(nums1[i]-nums2[i]); 
           sum = sum + absDiff;
           if(absDiff > maxAbsDiff) {
        	   maxAbsDiff = absDiff;
        	   num2pos = i;
           }
		}
		
		//find nearest number to nums2[num2pos] in nums1 (excluding nums1[nums2pos]
		int nearestNum = findNearestNumber(nums1,nums2[num2pos]);
		System.out.println("sum :: "+sum+"     nums2[nums2pos] :: "+nums2[num2pos]+"      nearestNum :: "+nearestNum);
		
		if(nearestNum == nums1[num2pos]) {
			return sum;
		}
		
		sum =0;
		
		for(int i =0; i<nums1.length;i++) {
			if(i == num2pos) {
				nums1[i] = nearestNum;
			}
			sum = (sum + Math.abs(nums1[i]-nums2[i]))%mod;
		}
		
		return sum;
	}
	
	
	public static int findNearestNumber(int[] arr,int num) {
		
		int nearest_diff_elem_num = Integer.MAX_VALUE;
		int nearestNum = Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==num) {
				return arr[i];
			}
			if(Math.abs(arr[i]-num) < nearest_diff_elem_num) {
				nearestNum = arr[i];
				nearest_diff_elem_num = Math.abs(arr[i]-num);
			}
			
			//System.out.println("arr[i] :: "+arr[i]+"    num :: "+num+"      nearest_diff_elem_num :: "+nearest_diff_elem_num+"    nearestNum :: "+nearestNum+"      Math.abs(arr[i]-num) :: "+Math.abs(arr[i]-num));
		}
		
		
		return nearestNum;
	}
 
 */





/*

APPRACH 1   (not at all working)

public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {      //nums1 = {1,7,5}    nums2 = {2,3,5}

		int len = nums1.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int num2pos = -1;
		
		for(int i=0;i<len;i++) {
           int absDiff = Math.abs(nums1[i]-nums2[i]); 
           sum = sum + absDiff;
           if(absDiff > max) {
        	   max = absDiff;
        	   num2pos = i;
           }
		}
		
		//find num nearest to nums2[num2pos] ...ie 3 in nums1
		int nearest = binarySearchNearstNum(nums1,nums2[num2pos],max);
		int minAbsDiff = Math.abs(nearest-nums2[num2pos]);
		int res = (sum - max)+minAbsDiff;
		
		System.out.println("nums2[num2pos] :: "+nums2[num2pos]+"      max :: "+max+"      nearest :: "+nearest+"       minAbsDiff :: "+minAbsDiff+"     sum :: "+sum);
		
		return res;
	}
	
	public static int binarySearchNearstNum(int[] arr,int num,int max) {  //1,2,4      3
		Arrays.sort(arr);
		
		System.out.println("arr :: "+Arrays.toString(arr));
		System.out.println("num :: "+num);
		
		if(num < arr[0]) {
			return arr[0];
		}
		
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			
			int mid = start + (end - start) / 2;
			System.out.println("start :: " + start + "     mid :: " + mid + "         end :: " + end+"       midval :: " + arr[mid]);

			if (num < arr[mid]) {
				end = mid-1;
			} 
			else if(num > arr[mid]) {
				start = mid+1;
			}
			else {
				return arr[mid];
			}
		}
		
		System.out.println("start :: "+arr[start]+"    end :: "+arr[end]);
		
		int startDiff = Math.abs(arr[start] - num);
		int endDiff = Math.abs(arr[end] - num);
		
		if(startDiff < endDiff) {
			return arr[start];
		}
		
		return arr[end];
	}

*/