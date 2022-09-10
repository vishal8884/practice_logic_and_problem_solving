package Course.Assignments.searching.easy;

public class Q9_PeakIndexInMountainArray {

	public static void main(String[] args) {

		int[] arr = {3,5,6,12,7,4,2,1,0};
		int[] arr2 = {3,4,5,1};
		int[] arr3 = {0,1,2,3,12,15,20,24,8,3,1 ,0};    //len = 12
		int res = peakIndexInMountainArray(arr3);
		
		System.out.println("res :: "+res);
	}
	
	public static int peakIndexInMountainArray(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"       end :: "+end+"      midval :: "+arr[mid]);
			
			if(arr[mid] > arr[mid+1]) {
				end = mid;            //this might be possible ans so not doing end = mid -1;
			}
			else {
				start = mid +1;
			}
		}
		
		return start;
	}

}
