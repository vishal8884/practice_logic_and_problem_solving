package Course.Assignments.searching.easy;

public class Q2_GuessNumber_higherOrLower {

	public static void main(String[] args) {

		int res = guessNumber(8);
		System.out.println("res :: "+res);
	}

	public static int guessNumber(int n) { // own solved

		int start = 1;
		int end = n;
		// 1,2,3,4,5,6,7,8,9,10
		
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(guess(mid) == -1) {     //guess is higher than the number
				end = mid - 1;
			}
			else if (guess(mid) == 1) {     //guess is lower than the number
				start = mid + 1;
			}
			else {                          // guess is equal to number
				return mid;        
			}
		}
		
		return -1;
	}
	
	
	public static int guess(int num) {
		
		int pick = 6;
		if(num > pick) {
			return -1;
		}
		if(num < pick) {
			return 1;
		}
		
		return 0;
	}

}
