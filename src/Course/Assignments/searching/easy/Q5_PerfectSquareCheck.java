package Course.Assignments.searching.easy;

public class Q5_PerfectSquareCheck {

	public static void main(String[] args) {

		boolean res = isPerfectSquare(808201);
		System.out.println("res :: "+res);
	}

	public static boolean isPerfectSquare(int num) {

		if(num ==0)
			return true;
		
		long start =1;
		long end = Integer.MAX_VALUE;
		// 1,2,3,4,5,6,7,8,9,10
		
		while(start <= end) {
			
			long mid = start + (end - start)/2;
			System.out.println("start :: "+start+"   mid ::  "+mid+"      end :: "+end);
			
			if(mid*mid > num) {
				end = mid -1;
			}
			else if(mid*mid < num) {
				start = mid +1;
			}
			else {
				return true;
			}
		}
		
		return false;
	}

}
