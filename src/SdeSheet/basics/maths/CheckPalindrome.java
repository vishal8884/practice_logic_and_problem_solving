package SdeSheet.basics.maths;

public class CheckPalindrome {

	public static void main(String[] args) {

		int num = 121;
		check(num);
	}
	
	public static void check(int num) {
		int n = num;
		int rev = 0;
		
		while(n != 0) {
			int remainder = n%10;
			rev = rev*10 + remainder;
			n = n/10;
		}
		
		if(rev == num) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}

}
