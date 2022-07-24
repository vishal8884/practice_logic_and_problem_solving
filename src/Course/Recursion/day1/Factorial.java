package Course.Recursion.day1;

public class Factorial {

	public static void main(String[] args) {

		int res = getFact(6);
		System.out.println("res :: "+res);
	}

	public static int getFact(int n) {

		if(n<=1) {
			return 1;
		}
		return n*getFact(n-1);
	}
}
