package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q7_FindRightIntervel {

	public static void main(String[] args) {

		int[][] arr  = {{3,4},{2,3},{1,2}};
		int[][] arr2 = {{1,2}};
		int[][] arr3 =  {{1,4},{2,3},{3,4}};
		int[][] arr4 = {{1,2},{2,3},{0,1},{3,4}};     //expected res = 1,3,0,-1
		int[] res = findRightInterval(arr4);
		
		System.out.println("res :: "+Arrays.toString(res));
	}

	public static int[] findRightInterval(int[][] arr){
		if(arr.length <=1 ) return new int[]{-1};
		
		int[] res = new int[arr.length];
		Arrays.fill(res, -1);
		int x =0;

		for(int i=0;i<arr.length;i++) {
	        for(int j =0;j<arr.length;j++) {
	        	System.out.println("arr[i][1] :: "+arr[i][1]+"      arr[j][0] :: "+arr[j][0]+"       i :: "+i+"       j :: "+j);
	        	if(arr[i][1] <= arr[j][0]) {
	        		res[i] = j;
	        		System.out.println("---");
	        		continue;
	        	}
	        }
	        System.out.println();
		}
		return res;
	}

}
