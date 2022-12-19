package SdeSheet.arrays.medium;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {

		int[] num = {2,0,2,1,1,0};
		sortColors(num);
		
		System.out.println("sorted num :: "+Arrays.toString(num));
	}

	public static void sortColors(int[] nums) {
		int r=0,w=0,b=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) {
				r++;
			}
			if(nums[i] == 1) {
				w++;
			}
			if(nums[i] == 2) {
				b++;
			}
		}
		
		System.out.println("r :: "+r+"    w :: "+w+"     b :: "+b);
		
		for(int i=0;i<=1;i++) {
			nums[i] = 0;
		}
		for(int i=2;i<=3;i++) {
			nums[i] = 1;
		}
		for(int i=4;i<=5;i++) {
			nums[i] = 2;
		}
	}

}
