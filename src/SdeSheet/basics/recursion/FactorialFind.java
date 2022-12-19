package SdeSheet.basics.recursion;

public class FactorialFind {

	public static void main(String[] args) {

		int res = fact(5);
		
		System.out.println("res :: "+res);
		
	}
	
	
	public static int fact(int n) {
		if(n>0) {
			return n * fact(n-1);
		}
		return 1;
	}

}
