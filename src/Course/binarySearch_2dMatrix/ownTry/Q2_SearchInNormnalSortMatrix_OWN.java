package Course.binarySearch_2dMatrix.ownTry;

import java.util.Arrays;

public class Q2_SearchInNormnalSortMatrix_OWN {

	public static void main(String[] args) {

		int[][] matrix = { {1, 2, 3, 4}, // 0th row                 total len =16   mid = 7   matrix[mid] =8
				           {5, 6, 7, 8}, // 1st row
				           {9,10,11,12}, // row
				           {13,14,15,16} };
		
		int[] res = searchInSortedArray(matrix,2);
		System.out.println("res :: "+Arrays.toString(res));
	}                                                                      // solved by own....
	
	public static int[] searchInSortedArray(int[][] matrix, int target) {       //binary search row by row   1,2,3,4 then 5,6,7,8 ....
		
		int[] res = {-1,-1};
		
		int rowStart = 0;
		int rowEnd = matrix.length-1;
		
		int columnStart = 0;                      // this start is used for column start purpose
		int columnEnd = matrix.length-1;
		
		
		//1, 2, 3, 4
		while(rowStart <= rowEnd) {         
			int prevstart = columnStart;
			int prevend = columnEnd;
			
			int columnMid = columnStart + (columnEnd -columnStart)/2;
			System.out.println("start :: "+columnStart+"      mid :: "+columnMid+"       end :: "+columnEnd+"     curr :: "+matrix[rowStart][columnMid]);
			
			
			if(matrix[rowStart][columnMid] < target) {
				columnStart = columnMid +1;
			}
			else if(matrix[rowStart][columnMid] > target) {
				columnEnd = columnMid -1;
			}
			else if(matrix[rowStart][columnMid] == target){
				return new int[] {rowStart,columnMid};
			}
			
			if(prevstart == prevend) {           //using prevstart and prevend as curent start and ned gets modified in current loop
				rowStart ++;
				columnStart=0;
				columnEnd =matrix.length-1;
			}
			
			else if(matrix[rowStart][columnEnd] > target) {      // as [rowStart][columnEnd] is the greatest in the current row .... so if target is less than that it cant be inside
				rowStart ++;
				columnStart=0;
				columnEnd =matrix.length-1;
			}
			
		}
		
		return res;
	}

}



/*
public static int[] searchInSortedArray(int[][] matrix, int target) {
	
	int[] res = new int[2];
	
	int rowStart = 0;
	int rowEnd = matrix.length-1;
	
	int columnStart = 0;
	int columnEnd = matrix.length-1;
	
	
	
	while(rowStart <= rowEnd) {
		
	    int start = columnStart;
		int end = columnEnd;
		
		int mid = start + (end -start)/2;
		System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"     curr :: "+matrix[rowStart][mid]);
		
		if(matrix[rowStart][mid] < target) {
			start = mid +1;
		}
		else if(matrix[rowStart][mid] > target) {
			end = end -1;
		}
		else if(matrix[rowStart][mid] == target){
			res[0] = rowStart;
			res[1] = mid;		
			break;
		}
		if(start >= end) {
			rowStart ++;
			columnStart=0;
			columnEnd =matrix.length-1;
		}
	}
	
	return res;
}
*/



//int mid = row + (column - row)/2;
//
//if(mid < target) {
//	row = mid +1;
//}
//else if(mid > target) {
//	column = mid +1;
//}
//else {
//	
//}