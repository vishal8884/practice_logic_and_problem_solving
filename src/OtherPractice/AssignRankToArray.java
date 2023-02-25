package OtherPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AssignRankToArray {

	public static void main(String[] args) {
		int[] arr = {40,10,20,30};
		int[] arr2 = {37,12,28,9,100,56,80,5,12};
		
		int[] res = assignRanksToArray(arr2);
		System.out.println("res :: "+Arrays.toString(res));
	}
	
	public static int[] assignRanksToArray(int[] arr) {
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Map<Integer, Integer> map = new HashMap<>();
		int count = 1;
		System.out.println("arr :: "+Arrays.toString(arr));
		
		Arrays.sort(arrCopy);

		//store rank of each numbers in a map
		for(int i : arrCopy) {
			if(!map.containsKey(i)) {
			   map.put(i,count);
			   count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				arr[i] = map.get(arr[i]); //gets rank for that value
			}
		}
		
		System.out.println("arrCopy :: "+Arrays.toString(arrCopy));
		System.out.println("map :: "+map);
		return arr;
	}

}
