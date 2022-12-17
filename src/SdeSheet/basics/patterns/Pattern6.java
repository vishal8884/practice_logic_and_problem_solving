package SdeSheet.basics.patterns;

public class Pattern6 {

	public static void main(String[] args) {

		print(5);
	}
	
	public static void print(int n) {
		int x = (n*2)-1;
		int a = n-1;
		int c=1;
		
		//* * * * * * * * *
		for(int i=0;i<n;i++) {
			for(int j=0;j<x;j++) {
				if(j>=a && j<a+c) {
				    System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			a--;
			c++;
			System.out.println();
		}
	}

}
