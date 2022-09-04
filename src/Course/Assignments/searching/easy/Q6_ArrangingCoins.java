package Course.Assignments.searching.easy;

public class Q6_ArrangingCoins {

	public static void main(String[] args) {

		int res = arrangeCoinsLinear(8);
		System.out.println("res :: "+res);
	}
	
	
	
    public static int arrangeCoins(int n) {           //binary approach
		
		return -1;
	}
    
    
    
    /////////////////////////////////LINAEAR APPROACH ////////////////////////////////////////////////

	public static int arrangeCoinsLinear(int n) {           //linear approach slow   n=5 eg
		
		if(n==1)
			return 1;
		
		int row =1;
		int res = -1;
		
		for(long i=1;i<Long.MAX_VALUE;i=i+row) {             //i =1 + 1 ... i = 1 + 2.... i = 3 + 3..... i = 7 + 4   //trying to get pattern 1,3,6
			
			if(i < n) {          // row incremented till i is less than or equal 5
			  row++;
			}
			else {  // i > n
			  if(i==n) {
				  res = row;
			  }
			  else {
			     res = row-1;
			  }
			  return res;
			}
			System.out.println("i :: "+i+"     row :: "+row);
		}
		return -1;
	}
	
	
	
	/////////////////////////////////////Linaer2///////////////////////////////////////////////////////////////////////
	
	
	public static int arrangeCoins2(int n) {
		
		int rowSum = 0;
		
		for(long row=1; row<Long.MAX_VALUE; row++) {
			rowSum += row;
			
			if(rowSum > n) {
				return (int)row-1;
			}
			
			//System.out.println("row :: "+row+"      rowSum :: "+rowSum);
		}
		
		return -1;
	}
	
}



//public static int arrangeCoins(int n) {
//	
//	if(n==1)
//       return 1;
//	//1  2,3    4,5,6    7,8,9,10
//	int row =1;
//	int num=0;
//	while(true) {
//		
//		num = num + row;
//		row++;
//		
//		int currRow = row - 1;
//		System.out.println("num :: "+num+"     row :: "+currRow);
//		
//		if(num == n) {
//			return row;
//		}
//		
//		if(num > n) {
//			return row-2;
//		}
//		
//	}
//	
//}