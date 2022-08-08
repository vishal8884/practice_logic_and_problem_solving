package Course.Assignments.searching.easy;

public class Q10_CountNegetiveInMatrix {

	public static void main(String[] args) {
                            //col
		int[][] matrix = { {4,3,2,-1},
		                   {3,2,1,-1},        //row(1) = {3,2,1,-1)           0,2 = 2
		                   {1,1,-1,-2},
		                   {-1,-1,-2,-3}};
		
		int[][] matrix3 = { {4,3,2,-1},
                            {3,2,1,-1},        //row(1) = {3,2,1,-1)           0,2 = 2
                            {-1,-1,-2,3},
                            {1,1,-1,-2}};
		
		int[][] matrix2 = {{5,1,0},
		                   {-5,-5,-5}};	
		int res = countNegatives(matrix);
		System.out.println("res :: "+res);
	}

	
	public static int countNegatives(int[][] grid) {       //binary
		
		int rows = grid.length;
		int cols = grid[0].length;
		int colstart = 0;
		int colend = cols-1;
		int c = 0;
		
		for(int row=0; row<rows; row++) {
			
			if(grid[row][0] < 0) {
				c = c + cols; 
				continue;
			}
			if(grid[row][colend] >= 0) {
				continue;
			}
			
			int start = colstart;                          
			int end = colend;
			
			while(start < end) {           //4,3,2,-1   //1,1,-1,-2     // 1,-1,-2    //2,3,-1,-5,-6,-10,-20 (this)
				                                                            //at last arr[start] = -1 and arr[end] = 3 in this array as -1 as first neg and 
				                                                            //3 is first pos....adn start is increasing and mid is decreasing
				
				int mid = start + (end - start)/2;
				System.out.println("row :: "+row+"       start :: "+start+"         mid :: "+mid+"          end :: "+end);
				
				if(grid[row][mid] >= 0) {
					start = start + 1;
				}
				else {
				    end = end -1;      // at last end decrease because it satifies this case and points to the last positive no
				}
			}
			c = c + (cols - start);
			colend = end;
			System.out.println();
		}
		
		return c;
	}
	
	
	/////////////////////////////////Linear approach////////////////////////////////////////////////////////////////
	
	public static int countNegativesLinear(int[][] grid) {       //linear brute force approach

		int c = 0;
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]<0) {
					c++;
				}
			}
		}
		
		return c;
	}

}


//public static int countNegatives(int[][] grid) {
//    int rows = grid.length, cols = grid[0].length; 
//    int res = 0, lastNeg = cols - 1;
//    for (int row = 0; row < rows; row++) {
//        //check edge cases - if first element is < 0 - all elements in row are negative
//        if (grid[row][0] < 0) {
//            res+=cols;
//            continue;
//        }
//        //if last element is positive - it means there are no negative numbers in a row
//        if (grid[row][cols - 1] > 0)
//            continue;
//        //there is a mix of negative and positive ones, need to find the border. starting
//        //binary search
//        int start = 0, end = lastNeg;
//        while (start <= end) {
//            int m = start + (end - start)/2;
//            if (grid[row][m] < 0) {
//                end = m - 1;
//            } else
//                start = m + 1;
//        }
//        //start points to the first negative element, which means cols - start is a number of
//        //such elements
//        res += (cols - start); lastNeg = end;
//    }
//    return res;
//}


//public static int countNegatives(int[][] grid) {       //binary
//
//	int rowstart = 0;
//	int rowend = grid.length-1;
//	
//	int colstart = 0;
//	int colend = grid[0].length-1;
//	
//	int counter =0;
//	int c=0;
//	
//	while(rowstart <= rowend) {    //iterating column only
//		c++; if(c==20) break;
//		
//		int mid = colstart + (colend - colstart)/2;
//		System.out.println("rowstart :: "+rowstart+"        colstart :: "+colstart+"          mid :: "+mid+"           colend :: "+colend+"         counter :: "+counter);
//		
//		if(grid[rowstart][mid] >= 0) {
//			colstart = mid +1;
//		}
//		else {                      //grid[rowstart][mid] < 0
//			int noOfNextElem = grid.length - mid; 
//			counter = counter + noOfNextElem;
//			colend = mid-1;
//		}
//		
//		if(colstart > colend) {
//			rowstart++;
//			colstart = 0;
//			colend = grid[0].length;
//			System.out.println("breaking :: "+counter);
//			System.out.println();
//		}
//		
//		
//		if(colstart == colend) {
//			if(grid[rowstart][colend] < 0) {
//				counter++;
//			}
//			rowstart++;
//			colstart = 0;
//			colend = grid[0].length-1;
//			System.out.println("breaking :: "+counter);
//			System.out.println();
//		}
//		
//	}
//	
//	return counter;
//}





//public static int countNegatives(int[][] grid) {       //binary
//
//	int rowstart = 0;
//	int rowend = grid.length-1;
//	
//	int colstart = 0;
//	int colend = grid[0].length-1;
//	
//	int counter =0;
//	int c=0;
//	
//	while(rowstart <= rowend) {    //iterating column only
//		c++; if(c==20) break;
//		
//		int mid = colstart + (colend - colstart)/2;
//		System.out.println("rowstart :: "+rowstart+"        colstart :: "+colstart+"          mid :: "+mid+"           colend :: "+colend+"         counter :: "+counter);
//		
//		if(grid[rowstart][mid] >= 0) {
//			colstart = mid +1;
//		}
//		else {                      //grid[rowstart][mid] < 0
//			int noOfNextElem = grid.length - mid; 
//			counter = counter + noOfNextElem;
//			colend = mid-1;
//			System.out.println("counter :: "+counter);
//		}
//		
//		
//		if(colstart == colend) {
//			if(grid[rowstart][colend] < 0) {
//				counter++;
//			}
//			rowstart++;
//			colstart = 0;
//			System.out.println("breaking loop :: "+counter);
//			System.out.println();
//		}
//		
//	}
//	
//	return counter;
//}