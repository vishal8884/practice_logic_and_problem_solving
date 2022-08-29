package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q13_FindPeakElem_2_2d {

	public static void main(String[] args) {
		
		int[][] arr = {{10,20,15},
		               {21,30,14},
		               {07,16,32}};
		
		int[][] arr2 = {{4,2,5,1,4,5},
				        {2,9,3,2,3,2},
				        {1,7,6,0,1,3},
				        {3,6,2,3,7,2}};
		
		int[] res = findPeakGrid(arr2);
		System.out.println("res :: "+Arrays.toString(res));
	}
	
	
	public static int[] findPeakGrid(int[][] arr) {
	 
		int startcol =0;
		int endcol = arr[0].length-1;
		
		while(startcol <= endcol) {
			int midcol = startcol + (endcol - startcol)/2;
			int maxRowVal = 0;
			int maxRowPos = -1;
			
			//find the max elem in mid col
			for(int row=0;row<arr.length;row++) {
				if(arr[row][midcol] > maxRowVal) {
					maxRowVal = arr[row][midcol];
					maxRowPos = row;
				}
			}
			System.out.println("startcol :: "+startcol+"     midcol :: "+midcol+"      endcol :: "+endcol+"    maxRowPos :: "+maxRowPos+"     val :: "+arr[maxRowPos][midcol]);
			
			if(midcol > startcol && arr[maxRowPos][midcol - 1] > arr[maxRowPos][midcol]) {
				endcol = midcol - 1;
			}
			else if(midcol < endcol && arr[maxRowPos][midcol + 1] > arr[maxRowPos][midcol]) {
				startcol = midcol + 1;
			}
			else {
				return new int[] {maxRowPos,midcol};
			}
		}
		
		return new int[] {-1,-1};
	}
	
	
	/////////////////////////////////////////O(N squared)////////////////////////////////////////////////////////////////////////
	
	public static int[] findPeakGrid2(int[][] arr) {
		 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				int top = (i!=0) ? arr[i-1][j] : Integer.MIN_VALUE;
				int bottom = (i!= arr.length-1) ? arr[i+1][j] : Integer.MIN_VALUE;
				int left = (j!=0) ? arr[i][j-1] : Integer.MIN_VALUE;
				int right = (j != arr[0].length-1) ? arr[i][j+1] : Integer.MIN_VALUE;
				
				if(arr[i][j] > top && arr[i][j] > bottom && arr[i][j] > left && arr[i][j] > right) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
}

