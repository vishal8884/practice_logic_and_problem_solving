package Course.sorting.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q14_MinimumAbsDifference {

	public static void main(String[] args) {

		int[] arr = {-14,-10,-4,3,8,19,23,27};
		int[] arr2 = {-57,-70,6,-69,5,-47,-13};
		List<List<Integer>> res = minimumAbsDifference(arr);
		
		System.out.println("res :: "+res);
	}
	
	
	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		System.out.println("sorted arr :: "+Arrays.toString(arr));
		List<List<Integer>> res = new ArrayList<>();
		int minDiffrence = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			int diff = Math.abs(arr[i] - arr[i-1]);
			List<Integer> elem = List.of(arr[i-1],arr[i]);
			
			/*
			 * We keep on adding min val unless we find something lesser than current min..then we clear the list
			 */
			if(diff < minDiffrence) {
				minDiffrence = diff;
				res.clear();
				res.add(elem);
			}
			else if(diff == minDiffrence) {
				res.add(elem);
			}
			System.out.println("elem :: "+elem+"    diff :: "+diff+"   minDiff :: "+minDiffrence);
		}

		
		return res;
	}

	public static List<List<Integer>> minimumAbsDifference_slow(int[] arr) {
		Arrays.sort(arr);
		System.out.println("sorted arr :: "+Arrays.toString(arr));
		List<List<Integer>> res = new ArrayList<>();
		int minDiffrence = Integer.MAX_VALUE;
		Map<List<Integer>,Integer> map = new LinkedHashMap<>();
		
		for(int i=1;i<arr.length;i++) {
			int diff = Math.abs(arr[i] - arr[i-1]);
			List<Integer> elem = List.of(arr[i-1],arr[i]);
			
			if(diff < minDiffrence) {
				minDiffrence = diff;
			}
			map.put(elem, diff);
			System.out.println("elem :: "+elem+"    diff :: "+diff+"   minDiff :: "+minDiffrence);
		}

		System.out.println("map :: "+map);
		
		for(Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
			if(entry.getValue() == minDiffrence) {
				res.add(entry.getKey());
			}
		}
		
		return res;
	}


}












/*
 * public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		System.out.println("sorted arr :: "+Arrays.toString(arr));
		Map<List<Integer>, Integer> map = new HashMap<>();
		List<List<Integer>> res = new ArrayList<>();
		int startVal = -1;
		int counter = 0;
		
		for(int i=1;i<arr.length;i++) {
			int diff = Math.abs(arr[i] - arr[i-1]);
			map.put(List.of(arr[i-1],arr[i]), diff);
		}
		
		Map<List<Integer>,Integer> sortedByValues = map.entrySet().stream()
				.sorted(Map.Entry.<List<Integer>,Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("sortedByValues :: "+sortedByValues);
		
		for(Map.Entry<List<Integer>, Integer> entry : sortedByValues.entrySet()) {
			if(startVal != entry.getValue() && counter != 0) {
				break;
			}
			startVal = entry.getValue();
			counter++;
			res.add(entry.getKey());
		//	System.out.println("key :: "+entry.getKey()+"     value :: "+entry.getValue()+"     startVal :: "+startVal);
		}
		
		
		return res;
	}
 */
