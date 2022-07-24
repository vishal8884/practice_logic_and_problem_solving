package Course.Recursion.day1;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {

		getSum(1,5,0);
	}
	
	public static void getSum(int i,int n,int sum) {
		if(i==n) {
			sum=sum+i;
			System.out.println("sum :: "+sum);
			return;
		}
		
		sum = sum +i;
		getSum(i+1, n, sum);
		System.out.println(i);
	}
	
	/////////////////////////////////
	
	public static void getSum2(int i,int n,int sum) {
		if(i==n+1)
			return;
		
		sum = sum +i;
		System.out.println("sum :: "+sum);
		getSum2(i+1, n, sum);
	}

}
