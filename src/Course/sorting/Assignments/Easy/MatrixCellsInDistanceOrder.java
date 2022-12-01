package Course.sorting.Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MatrixCellsInDistanceOrder {

	public static void main(String[] args) {

		//int[][] res = allCellsDistOrder(2, 2, 0, 1);
		int[][] res2 = allCellsDistOrder(5,5, 3, 2);
		
		System.out.println("res :: "+Arrays.deepToString(res2));
	}
	
	public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int distince = Math.abs(r0 - i) + Math.abs(c0 - j);  //get the distance
                List<int[]> list = map.getOrDefault(distince, new ArrayList<>());
                list.add(new int[] {i, j});
                map.put(distince, list);
            }
        }
        int[][] result = new int[R * C][2]; 
        int i = 0;
        for (Integer key : map.keySet()) {   //straight forward
            for (int[] temp : map.get(key)) {
               result[i++] = temp;
            }
        }
        return result;
    }
	
	public static int[][] allCellsDistOrder4(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        int index = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                ans[index] = new int[]{i, j};
                index++;
            }
        }
        Arrays.sort(ans, ((o1, o2) -> Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter) -Math.abs(o2[0] - rCenter) - Math.abs(o2[1] - cCenter)));
        return ans;
    }

	/*
	 * Working but very slow
	 */
	public static int[][] allCellsDistOrder3(int rows, int cols, int rCenter, int cCenter) {
		int[][] res = new int[rows*cols][2];
		HashMap<int[],Integer> map= new HashMap<>();
		int x = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				int distFromCenter = Math.abs(i-rCenter)+Math.abs(j - cCenter);
				int[] pos = {i,j};
				map.put(pos, distFromCenter);
				System.out.println("i :: "+i+"     j :: "+j+"     distFromCenter :: "+distFromCenter);
			}
			System.out.println();
		}
		
		HashMap<int[], Integer> sortedByDistanceMap = sortByValue(map);
		
		for(Map.Entry<int[], Integer> entry :sortedByDistanceMap.entrySet()) {
			res[x] = entry.getKey();
			x++;
			System.out.println("key :: "+Arrays.toString(entry.getKey())+"    value :: "+entry.getValue());
        }
		
		return res;
	}
	
	public static HashMap<int[], Integer> sortByValue(HashMap<int[], Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Entry<int[], Integer>> list= new LinkedList<Map.Entry<int[], Integer> >(hm.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));
 
        // put data from sorted list to hashmap
        HashMap<int[], Integer> temp= new LinkedHashMap<>();
        
        for (Map.Entry<int[], Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	
	
	
//	public static int[][] allCellsDistOrder2(int rows, int cols, int rCenter, int cCenter) {
//		Map<List<Integer>,Integer> map= new HashMap<>();
//		int[][] res = new int[rows*cols][2];
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				int distFromCenter = Math.abs(i-rCenter)+Math.abs(j - cCenter);
//				List<Integer> pos= new ArrayList<>();
//				pos.add(i);
//				pos.add(j);
//				map.put(pos,distFromCenter);
//				System.out.println("i :: "+i+"     j :: "+j+"    distFromCenter :: "+distFromCenter);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("map :: "+map);
//		
//		return res;
//	}

}
