package Course.Recursion.day1;

public class PrintFrom1To5 {

	static int ite=1;
	
	public static void main(String[] args) {

		printAscending(1);
	}
	
	public static void printAscending(int n) {
		if(n==6)
			return;
		System.out.println("n1:: "+n);
		printAscending(n+1);
	}

}
