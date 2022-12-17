package SdeSheet.basics.maths;

public class ArmsstrongNumber {

	public static void main(String[] args) {
		boolean res = findAmstrongOrNot(154);
		System.out.println("res :: "+res);
	}
	
	
	public static boolean findAmstrongOrNot(int num) {
		int n = num;
		int c = 0;
		int num2 = num;
		int powSum = 0;
		
		while(num !=0) {
			c++;
			num = num/10;
		}
		
		while(n!=0) {
			int pow = (int) Math.pow(n%10, c);
			powSum += pow;
			n = n/10;
		}
		
		System.out.println(powSum);
		
		return num2 == powSum;
	}
	
}
