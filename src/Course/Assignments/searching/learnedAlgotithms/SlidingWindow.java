package Course.Assignments.searching.learnedAlgotithms;

public class SlidingWindow {

	public static void main(String[] args) {

		int[] arr = {4,1,3,5,1,2,3,2,1,1,5};
		printMaxInSlidingArr(arr, 3);
	}
	
	
    public static void printMaxInSlidingArr(int[] arr,int k) {     //enhanced approach
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i;j<k+i;j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.println("i :: "+i+"     max :: "+max);
			max = Integer.MIN_VALUE;
		}
	}
	
	public static void printMaxInSlidingArr2(int[] arr,int k) {     //naive approach
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i;j<k+i;j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.println("i :: "+i+"     max :: "+max);
			max = Integer.MIN_VALUE;
		}
	}
}




/*
 * public static void printMaxInSlidingArr(int[] arr,int k) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<k+i;j++) {
//				if(arr[j] > max) {
//					max = arr[j];
//				}
				System.out.println("i :: "+i+"    j :: "+j);
			}
//			System.out.println("max :: "+max);
//			max = Integer.MIN_VALUE;
		}
	}
 */
