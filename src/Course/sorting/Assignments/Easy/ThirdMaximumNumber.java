package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] nums = {4,5,1,3,2,4,4,4,5};
		int[] nums2 = {2,2,3,1};
		int[] nums3 = {1,1,2};
		int[] nums5 = {1,2};
		int[] nums4 = {3,2,1,5,4};
		int res = thirdMax(nums4);
		System.out.println("res :: "+res);
	}

	public static int thirdMax(int[] arr) {
		
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;
		
		for(Integer n : arr) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
			if(max1 == null || n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			}
			if(max2 ==null || n > max2) {
				max3 = max2;
				max2 = n;
			}
			if(max3 == null || n > max2) {
				max3 = n;
			}
			System.out.println("max1 :: "+max1+"     max2 :: "+max2+"     max3 :: "+max3);
		}
		return max3 == null ? max1 : max3;
	}

}



/*
 * public static int thirdMax(int[] arr) {
		int len = arr.length;
		int prev = Integer.MIN_VALUE;
		int c =0;
		int res=Integer.MIN_VALUE;
		
		for(int i=len-1;i>0;i--) {
			int maxIndex = i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			System.out.println("maxIndex :: "+maxIndex+"     maxVal :: "+arr[maxIndex]+"     will be swapped with :: "+arr[i]+"       arr :: "+Arrays.toString(arr)+"    prev :: "+prev+"     c :: "+c);
			if(prev != arr[maxIndex]) {
				c++;
			}
			if(c==3) {
				res = arr[maxIndex];
				break;
			}
			prev = arr[maxIndex];
			swap(arr, i, maxIndex);
		}
		
		System.out.println("arr :: "+Arrays.toString(arr)+"     c :: "+c);

		if(arr.length <= 3 && c < 2) {
			return arr[arr.length-1];
		}
		
        return res==Integer.MIN_VALUE?arr[0]:res;
	}

	
	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
 */
