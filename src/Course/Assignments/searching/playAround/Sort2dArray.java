package Course.Assignments.searching.playAround;

import java.util.Comparator;

public class Sort2dArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,3},{0,1},{3,4}}; 
		sort(arr);
	}
	
	public static void sort(int[][] arr) {
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		int res = c.compare(12, 11);
		System.out.println("res :: "+res);
	}

}
