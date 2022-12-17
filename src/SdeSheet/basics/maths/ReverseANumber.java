package SdeSheet.basics.maths;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 321;
		reverse(num);
	}
	
	public static void reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int r = num % 10;
			rev = rev*10 + r;
			num = num /10;
		}
		
		
		System.out.println(rev);
	}

}
