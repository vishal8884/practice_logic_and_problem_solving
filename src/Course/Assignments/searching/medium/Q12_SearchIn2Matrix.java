package Course.Assignments.searching.medium;

public class Q12_SearchIn2Matrix {

	public static void main(String[] args) {

		int[][] arr = {{1, 3, 5, 7},
				       {10,11,16,20},
				       {23,30,34,60}};
		
		boolean res = searchMatrix(arr,11);
		
		System.out.println("res :: "+res);
 	}
	
    public static  boolean searchMatrix(int[][] matrix, int target) {       //binary search approach
		
		int starti = 0;
		int endi = matrix.length-1;
		
		int startj =matrix[0].length-1;
		int endj = 0;
		
		while(starti <= endi && startj >= endj) {
			
			if(matrix[starti][startj] < target) {
				starti++;
			}
			else if(matrix[starti][startj] > target) {
				startj--;
			}
			else {
				return true;
			}
		}
		
		return false;
	}

	public static  boolean searchMatrix2(int[][] matrix, int target) {       //naive approach
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == target) {
					return true;
				}
			}
		}
		
		return false;
	}

}
