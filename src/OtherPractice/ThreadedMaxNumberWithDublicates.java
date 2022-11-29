package OtherPractice;

public class ThreadedMaxNumberWithDublicates {

	public static void main(String[] args) {
		int[] arr = {2,3,2,4,5,3};
		int[] arr2 = {3,2,1};
		int res = thirdMax(arr2);
		
		System.out.println("res :: "+res);
	}

	
	public static int thirdMax(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		
		for(int num : arr) {
			if (num == max1 || num == max2 || num == max3)
				continue;
			if(num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			if(num > max2) {
				max3 = max2;
				max2 = num;
			}
			if(num > max3) {
				max3 = num;
			}
			System.out.println("max1 :: "+max1+"     max2 :: "+max2+"     max3 :: "+max3);
		}
		
		return max3;
	}
}
