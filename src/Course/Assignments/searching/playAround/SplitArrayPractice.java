package Course.Assignments.searching.playAround;

public class SplitArrayPractice {

	public static void main(String[] args) {

		int[] arr = {7,2,5,10,8};
		int res = splitArray(arr,2);
		
		System.out.println("res :: "+res);
	}
	
	public static int splitArray(int[] arr, int m) {
		
		int start = Integer.MIN_VALUE;
		int end = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > start) {
				start = arr[i];
			}
			end = end + arr[i];
		}
		
		while(start < end) {
			int mid = start + (end - start)/2;
			int sum =0;
			int pieces = 1;    // pieces is the one which we compare with mid
			
			for(int a: arr) {
				if(sum + a > mid) {
					sum = a;
					pieces ++;
				}
				else {
				    sum = sum + a;
				}
			}
			
			System.out.println("start :: "+start+"    mid :: "+mid+"     end :: "+end+"    pieces :: "+pieces);
			
			if(pieces > m) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
			
		}
		
		return end;
	}

}
