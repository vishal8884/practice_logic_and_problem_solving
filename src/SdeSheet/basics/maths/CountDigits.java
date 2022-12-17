package SdeSheet.basics.maths;

public class CountDigits {

	public static void main(String[] args) {

		int res = evenlyDivides(22074);
		System.out.println("res :: "+res);
	}

	static int evenlyDivides(int n) {
		int counter = 0;
		int noted = n;

		while(n != 0) {
			int a = n % 10;
			System.out.println("n :: "+n+"     a :: "+a);
			
			if(a!=0 && noted % a == 0) {
				counter++;
			}
			n = n/10;
		}
		
		return counter;
	}

}
