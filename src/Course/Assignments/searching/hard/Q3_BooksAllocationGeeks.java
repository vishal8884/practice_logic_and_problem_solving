package Course.Assignments.searching.hard;

public class Q3_BooksAllocationGeeks {

	public static void main(String[] args) {

		int[] arr = {12,34,67,90};
		int res = findPages(arr, 2);
		
		System.out.println("res :: "+res);
	}
	
	public static int findPages(int[] arr, int m) {
		
		int start = Integer.MIN_VALUE;
		int end = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > start) {
				start = arr[i];
			}
			end = end + arr[i];
		}
		
		System.out.println("start :: "+start+"     end :: "+end);
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			int pageSum = 0;
			int split = 0;
			
			for(int page : arr) {
				if(pageSum + page > mid) {
					split++;
					pageSum = page;
				}
				else {
				    pageSum = pageSum + page;
				}
			}
		}
		
		return -1;
	}

}
