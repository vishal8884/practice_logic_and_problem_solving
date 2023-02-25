package Course.sorting.Assignments.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q15_ArrayRankTransform {

	public static void main(String[] args) {

		int[] arr = {40,10,20,30};
		int[] arr2 = {37,12,28,9,100,56,80,5,12};
		int[] res = arrayRankTransform(arr);
		System.out.println("res :: "+Arrays.toString(res));
	}

	//use hash map
	/*
	 * Ow nworking AssignRankToArray.class package OtherPractice;
	 */
	public static int[] arrayRankTransform(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int x = 0;
		
		int[] arrCopy = Arrays.copyOf(arr,arr.length);
		Arrays.sort(arrCopy);
		
		//store rank of each numbers in a map
		for(int i : arrCopy) {
			map.putIfAbsent(i, map.size()+1);
		}
		System.out.println("map :: "+map);
		
		for(int i=0;i<arr.length;i++) {
			arrCopy[x] = map.get(arr[i]);
			x++;
		}
		
		return arrCopy;
	}
	
	private static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
