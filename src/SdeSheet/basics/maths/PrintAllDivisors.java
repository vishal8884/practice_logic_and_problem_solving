package SdeSheet.basics.maths;

public class PrintAllDivisors {

	public static void main(String[] args) {
		int n = 97;
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println("i :: "+i);
			}
		}
	}
}
