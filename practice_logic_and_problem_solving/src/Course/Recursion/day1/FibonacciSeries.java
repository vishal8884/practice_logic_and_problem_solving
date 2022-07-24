package Course.Recursion.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("curr :: "+0);
		System.out.println("curr :: "+1);
		fib(8,0,1,0);
	}
	
	public static void fib(int n,int a,int b,int curr) {
		if(n==0) {
			return;
		}
		curr = a+b;
		System.out.println("curr :: "+curr);
		fib(n-1,b,curr,0);
	}
	
	public static void fibNormal(int n) {
		
		int a=0;
		int b=1;
		int curr=0;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		for(int i=0;i<n;i++) {
			curr=a+b;
			System.out.println(curr);
			a=b;
			b=curr;
		}
	}

}
