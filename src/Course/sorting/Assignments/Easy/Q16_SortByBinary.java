package Course.sorting.Assignments.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q16_SortByBinary {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = {1024,512,256,128,64,32,16,8,4,2,1};
		
		int[] res = sortByBits(arr2);
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] sortByBits(int[] arr) {
		Map<Integer, Long> map = new HashMap<>();
		int[] res = new int[arr.length];
		int pos = 0;
		
		for(int i=0;i<arr.length;i++) {
			String binaryString = Integer.toBinaryString(arr[i]);
			long noOfBits = binaryString.chars().filter(c -> c =='1').count();
			map.put(arr[i], noOfBits);
			System.out.println("arr[i] :: "+arr[i]+"      binary i :: "+binaryString+"    noOfBits :: "+noOfBits);
		}
		
		Map<Integer, Long> sortedByValueMap = map.entrySet().stream()
		   //.sorted(Map.Entry.<Integer,Long>comparingByValue())
		  // .sorted(Comparator.comparing(comparin))
		   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("sortedMap :: "+sortedByValueMap);
		
	    //if two values (noOfBits) are same then we need to have min num first
		for(Map.Entry<Integer, Long> entry : sortedByValueMap.entrySet()) {
			res[pos] = entry.getKey().intValue();
			pos++;
		}
		
		return res;
	}
	
	

}
