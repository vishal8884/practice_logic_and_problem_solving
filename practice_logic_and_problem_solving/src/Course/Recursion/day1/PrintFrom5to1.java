package Course.Recursion.day1;

public class PrintFrom5to1 {

	public static void main(String[] args) {

		printNums(5);
	}
	
	public static void printNums(int n) {
		if(n==0) {
			return;
		}
		System.out.println("n :: "+n);
		printNums(n-1);
	}

}
