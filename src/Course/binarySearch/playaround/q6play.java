package Course.binarySearch.playaround;

public class q6play {

	public static void main(String[] args) {

		int[] arr = {1,2,1,3,5,6,4};   //len = 7 ...... mid = 3  midval = 3
		int[] arr2 = {2,1};
		int res = findPeakElement(arr);
		
		System.out.println("res :: "+res);
	}

	public static int findPeakElement(int[] num) {
		int l = 0;
		int r = num.length - 1;
		int mid = r / 2;
		while (l < r) {
			if (num[mid] < num[mid + 1]) {
				l = mid + 1;
			} else {
				r = mid;
			}
			mid = (l + r) / 2;
		}
		return l;
	}

}
