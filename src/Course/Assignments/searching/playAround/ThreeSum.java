package Course.Assignments.searching.playAround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> res = threeSum(arr);
		System.out.println("res :: "+res);
	}

		
	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		System.out.println("nums :: "+Arrays.toString(nums));
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++) {
			
			if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
			    int reqSum = 0 - nums[i];
			
			    int low = i+1;
			    int high = nums.length-1;
			
			    while(low < high) {
				    if(nums[low] + nums[high] == reqSum) {
					    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
					    
//					    while(low < high && nums[low] == nums[low+1]) low++;
//					    while(low < high && nums[high] == nums[high-1]) high--;
					
					    low++;
					    high--;
					
				    }
				    else if(nums[low] + nums[high] < reqSum) {
					    low++;
				    }
				    else {
					    high--;
				    }
			    }
			}
		}
		
		return res;
	}
	
	
	public static List<List<Integer>> twoSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
			
		int low = 0;
		int high = nums.length-1;
			
		while(low < high) {
			System.out.println("low :: "+low+"     high :: "+high);
			if(nums[low] + nums[high] == 0) {
				res.add(new ArrayList<>(Arrays.asList(low,high)));
				low++;
				high--;
			}
			else if(nums[low] + nums[high] < 0) {
				low++;
			}
			else {
				high--;
			}
		}
		
		return res;
	}

}
