package Course.binarySearch_2dMatrix;

import java.util.Arrays;

public class Q2_SearchInNormnalSortMatrix {

	public static void main(String[] args) {

		int[][] matrix = { {1, 2, 3, 4}, // 0th row                 total len =16   mid = 7   matrix[mid] =8
				           {5, 6, 7, 8}, // 1st row
				           {9,10,11,12}, // row
				           {13,14,15,16} };
		
		int[] res = searchInSortedArray(matrix,7);
		System.out.println("res :: "+Arrays.toString(res));
	}                                                                      
	
	public static int[] searchInSortedArray(int[][] matrix, int target) {       
		
		int rows = matrix.length;
		int cols = matrix[0].length; //this can be 0 .. so need to handle it
		
		
		if(rows == 1) {
			return binarySearch(matrix, 0, 0, cols-1, target);   // only 1 row {1,2,3,4}   ...do binary search for this row
		}
		
		int rowStart = 0;               //we can also do column wise
		int rowEnd = rows-1;
		int cMid = cols/2;
		
		//run the loop till 2 rows are remaining
		while(rowStart < (rowEnd -1)) {                           ///////////while loop till 2  r are remaining
			int mid = rowStart + (rowEnd = rowStart)/2;
			
			if(matrix[mid][cMid] == target) {
				return new int[] {mid,cMid};
			}
			if(matrix[mid][cMid] < target) {
				rowStart = mid;
			}
			else {
				rowEnd = mid;
			}
		}
		
		
		//after this while loop we have two rows remaining
		//check if the target is in col of two rows
		
		if(matrix[rowStart][cMid] == target) {
			return new int[] {rowStart,cMid};
		}
		if(matrix[rowStart+1][cMid] == target) {
			return new int[] {rowStart+1,cMid};
		}
		
		
		// search in 1st half
		if(target <= matrix[rowStart][cMid-1]) {
			return binarySearch(matrix, rowStart, 0, cMid-1, target);
		}
		
		// search in 2nd half
        if(target <= matrix[rowStart][cMid+1]  &&  target <= matrix[rowStart][cols-1]) {
        	return binarySearch(matrix, rowStart, cMid+1, cols-1, target);
		}
		// search in 3rd half
        if(target <= matrix[rowStart + 1][cMid-1]) {
        	return binarySearch(matrix, rowStart+1, 0, cMid-1, target);
		}
		// search in 4th half
        else {
        	return binarySearch(matrix, rowStart+1, cMid+1, cols-1, target);
        }
        
	}
	
	
	
	//search in row provided between column provided
	public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
		
		while(cStart <= cEnd) {
			
			int mid = cStart + (cEnd -cStart)/2;
			
			if(matrix[row][mid] == target) {
				return new int[] {row,mid};
			}
			if(matrix[row][mid] < target) {
				cStart = mid +1;
			}
			else {
				cEnd = mid -1;
			}
		}
		return new int[] {-1,-1};
	}

}