package SdeSheet.basics.patterns;

public class Pattern3 {

	public static void main(String[] args) {

		print(5);
	}
	
	public static void print(int n) {
		int x=1;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=x;j++) {
				System.out.print(j);
			}
			x++;
			System.out.println();
		}
	}

}
