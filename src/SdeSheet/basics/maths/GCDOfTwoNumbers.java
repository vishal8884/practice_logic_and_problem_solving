package SdeSheet.basics.maths;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int res = findGcdOfTwoNumbers(2, 8);
		System.out.println("res :: " + res);
	}

	public static int findGcdOfTwoNumbers(int a, int b) {
		int num1 = 3, num2 = 6;
		int ans = 1;
		for (int i = 1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				ans = i;
			}
		}
		
		return ans;
	}
}
