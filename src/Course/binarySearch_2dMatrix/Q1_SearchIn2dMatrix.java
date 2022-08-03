package Course.binarySearch_2dMatrix;

import java.util.Arrays;

public class Q1_SearchIn2dMatrix {

	public static void main(String[] args) {

		                  //column
		int[][] matrix = {{10,20,30,40},        // 0th row
				          {15,25,35,45},        // 1st row 
				          {28,29,37,49},        //row
				          {33,34,38,50}};
				
	
		int[] res = searchIn2dMatrix(matrix,28);
		System.out.println("res :: "+Arrays.toString(res));
	}
	
	public static int[] searchIn2dMatrix(int[][] matrix, int target) {

		int row=0;
		int column = matrix.length-1;
		
		while(row < matrix.length && column >=0) {
			
			if(target == matrix[row][column]) {
				return new int[]{row,column};
			}
			if(target < matrix[row][column]) {           // if target is lesser than current elem (40 at first)  just delete that entire column (ie (0,3)(1,3)(2,3)(3,3)
				column --;
			}
			else {   //target > matrix[row][column]
				row++;
			}
		}
		
		return new int[] {-1,-1};     //if answer not found till last return -1,-1
	}
	
}



/*
int[][] matrix = {{10,20,30,40},
				          {15,25,35,45},
				          {28,29,37,49},        //row
				          {33,34,38,50}};
				          */
