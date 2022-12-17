package SdeSheet.basics.patterns;

public class Pattern1 {

	public static void main(String[] args) {

		print(5);
	}
	
	public static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
