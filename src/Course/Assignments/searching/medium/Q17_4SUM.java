package Course.Assignments.searching.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q17_4SUM {

	public static void main(String[] args) {

		int[] arr = {1,0,-1,0,-2,2};
		List<List<Integer>> res = fourSum(arr, 0);
		
		System.out.println("res :: "+res);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		
		
		return res;
	}

}







//public static List<List<Integer>> fourSum(int[] nums, int target) {
//
//	List<List<Integer>> res = new ArrayList<>();
//	Map<List<Integer>, List<List<Integer>>> map = new HashMap<>();
//	
//	for(int i=0;i<nums.length;i++) {
//		for(int j=0;j<nums.length;j++) {
//			for(int k=0;k<nums.length;k++) {
//				for(int l=0;l<nums.length;l++) {
//					if(i!= j && i!=k && i!=l && j!=k && j!=l && k!=l) {
//						if(nums[i]+nums[j]+nums[k]+nums[l] == target) {
//							if(!map.containsKey(Arrays.asList(nums[i],nums[j],nums[k],nums[l]))) {
//								res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
//								map.put(Arrays.asList(nums[i],nums[j],nums[k],nums[l]),res);
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//	
//	map.forEach((key,val) -> System.out.println("key :: "+key+"     val :: "+val));
//	
//	return res;
//}