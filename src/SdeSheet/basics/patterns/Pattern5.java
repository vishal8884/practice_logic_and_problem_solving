package SdeSheet.basics.patterns;

public class Pattern5 {

	public static void main(String[] args) {

		print(5);
	}
	
	public static void print(int n) {
		int x=n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<x;j++) {
				System.out.print("*");
			}
			x--;
			System.out.println();
		}
	}

}
