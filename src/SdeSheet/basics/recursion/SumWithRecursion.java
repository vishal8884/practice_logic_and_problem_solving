package SdeSheet.basics.recursion;

public class SumWithRecursion {

	public static void main(String[] args) {

		int sum = 0;
		sumOfFirstNNumbers(20,sum);
		
	}
	
	
	public static void sumOfFirstNNumbers(int n,int sum) {
		if(n ==0) {
			return;
		}
		sum = sum + n;
		System.out.println("sum :: "+sum);
		sumOfFirstNNumbers(n-1, sum);
	}

}
