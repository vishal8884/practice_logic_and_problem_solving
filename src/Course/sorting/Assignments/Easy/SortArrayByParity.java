package Course.sorting.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayByParity {

	public static void main(String[] args) {

		int[] arr = {3,1,2,4};
		int[] res = sortArrayByParity2(arr);
		
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] sortArrayByParity(int[] nums) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		List<Integer> combined = new ArrayList<>();
		int x = 0;

		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2 == 0) {
				even.add(nums[i]);
			}
			else {
				odd.add(nums[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		combined.addAll(even);
		combined.addAll(odd);
		
		System.out.println("even :: "+even+"     odd :: "+odd+"     combined :: "+combined);
		
		for(int i : combined) {
			nums[x] = i;
			x++;
		}
		
		return nums;
	}
	
	public static int[] sortArrayByParity2(int[] arr) {
        int x=0,e=0;
		 int[] res = new int[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2==0)
			 {
				 res[x++]=arr[i];
				 e++;
			 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2!=0)
			 {
				 res[e++]=arr[i];
			 }
		 }
		 return res;
   }

}
