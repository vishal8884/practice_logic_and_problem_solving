package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q14_FrequencyOfMostFrequentElement {

	public static void main(String[] args) {

		int[] arr = {1,4,8,13};
		int res = maxFrequency(arr, 5);
		
		System.out.println("res :: "+res);
	}
	
	
	
	 public static int maxFrequency(int[] A, int k) {
	        int res = 1, i = 0, j;
	        long sum = 0;
	        Arrays.sort(A);
	        for (j = 0; j < A.length; ++j) { 
	            sum += A[j];
	            
	            System.out.println("j :: "+j+"   A[j] :: "+A[j]+"     sum :: "+sum+"      i :: "+i);
	            
	            while (sum + k < (long)A[j] * (j - i + 1)) {
	                sum -= A[i];
	                i++;
	            }
	            res = Math.max(res, j - i + 1);
	        }
	        return res;
	    }
	 
	 
	 

	public static int maxFrequency5(int[] nums, int k) {
		int i=0;
		int k_backup = k;
		int freq = 0;
		int end = nums.length - 1;
		
		Arrays.sort(nums);
		
		while(i < nums.length && k >= 0) {
			int maxElem = nums[end];
			
			boolean c1 = nums[i]+k < maxElem;
			boolean c2 = nums[i]+k == maxElem;
			boolean c3 = nums[i]+k > maxElem;
			
			System.out.println("i :: "+i+"     nums[i] :: "+nums[i]+"     k :: "+k+"     end :: "+end+"      freq :: "+freq+"      maxElem :: "+maxElem+"     c1 :: "+c1+"     c2 :: "+c2+"     c3 :: "+c3+"     end :: "+end+"     nums[end] :: "+nums[end]);
			
			if(nums[i]+k < maxElem) {
				i++;
				k = k_backup;
			}
			else if(nums[i]+k == maxElem) {
				freq++;
				i++;
			}
			else if(nums[i]+k > maxElem) {
				k--;
			}
			
			if(i == end && k == 0) {
				i=0;
				end--;
				maxElem = nums[end];
				System.out.println();
			}
		}
		
		return freq;
	}

}
