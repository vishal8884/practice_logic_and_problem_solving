package Course.sorting.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SoringArrayByIncreasingFrquency {

	public static void main(String[] args) {
		int[] ip = {2,3,1,3,2};
		int[] ip2 = {1,1,2,2,2,3};
		int[] ip3 = {-1,1,-6,4,5,-6,1,4,1};
		int[] res = frequencySort(ip3);
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] frequencySort(int[] nums) {
		int[] res = new int[nums.length];
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("sorted array :: "+Arrays.toString(nums));

		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		System.out.println("map :: "+map);
		System.out.println("list before sorting :: "+list);
		
		Collections.sort(list, (a,b) -> {
			if(map.get(a) > map.get(b)) { //we are soring based on their frequency
				return 1; 
			}
			if(map.get(a) < map.get(b)) {
				return -1;
			}
			else {
				if(a > b) {
					return -1;
				}
				else {
					return 1;
				}
			}
		});
		
		System.out.println("list after sorting :: "+list);
		
		int x =0;
		for(int num : list) {
			for(int j=0;j<map.get(num);j++) {
				res[x] = num;
				x++;
			}
		}
		

		
		return res;
	}

}
