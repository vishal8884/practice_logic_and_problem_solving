	package SdeSheet.basics.recursion;

public class PrintNameNtimesNoLoop {

	public static void main(String[] args) {

		printGfg(10);
	}
	
	
	public static void printGfg(int n) {
		if(n == 0) {
			return;
		}
		printGfg(n-1);
		System.out.print("GFG ");
	}

}
