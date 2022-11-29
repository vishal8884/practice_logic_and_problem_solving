package Course.sorting.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MatrixCellsInDistanceOrder {

	public static void main(String[] args) {

		int[][] res = allCellsDistOrder(2, 2, 0, 1);
		int[][] res2 = allCellsDistOrder(2, 3, 1, 2);
		
		System.out.println("res :: "+Arrays.deepToString(res2));
	}

	
	
	
	
	
	
	
	
	/*
	 * Working but slow...need to do again...52/66 pass
	 */
	public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
		Map<List<Integer>,Integer> map= new HashMap<>();
		int[][] res = new int[rows*cols][2];
		List<List<Integer>> res2 = new ArrayList<>();
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				int distFromCenter = Math.abs(i-rCenter)+Math.abs(j - cCenter);
				List<Integer> pos= new ArrayList<>();
				pos.add(i);
				pos.add(j);
				map.put(pos,distFromCenter);
				System.out.println("i :: "+i+"     j :: "+j+"    distFromCenter :: "+distFromCenter);
			}
			System.out.println();
		}
		
		
		for(Map.Entry<List<Integer>,Integer> kv : map.entrySet()) {
			getMin(map,res2,res);
		}
		
		System.out.println("res2 :: "+res2);
		
		int x=0;
		for(List<Integer> l : res2) {
			res[x][0] = l.get(0);
			res[x][1] = l.get(1);
			System.out.println("x :: "+x+"    l :: "+l);
			x++;
		}
		
		return res;
	}
	
	public static int[][] getMin(Map<List<Integer>,Integer> map,List<List<Integer>> res2,int[][] res) {
		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();
		
		for(Map.Entry<List<Integer>,Integer> kv : map.entrySet()) {
			if(!res2.contains(kv.getKey()) && kv.getValue() < min) {
				min = kv.getValue();
				list = kv.getKey();
			}
		}
		res2.add(list);
		return res;
	}

}
