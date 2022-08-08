package Course.Assignments.searching.easy.playaround;

public class Q10_TEMP {

	public static void main(String[] args) {

		int[] arr = {2,3,-1,-5,-6,-10,-20};            //at last arr[start] = -1 and arr[end] = 3 in this array as -1 is first neg and 3 is first pos
		int[] arr2 = {1,1,-1,-2};
		
		int res = countNegetiveNumbers(arr);
		System.out.println("res :: "+res);
	}
	
	public static int countNegetiveNumbers(int[] arr) {
		
		if(arr[0] < 0) {
			return arr.length;
		}
		if(arr[arr.length-1] >= 0) {
			return 0;
		}
		
		int start = 0;
		int end = arr.length - 1;
		int c = 0;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"          mid :: "+mid+"         end :: "+end+"        midval :: "+arr[mid]+"        endval :: "+arr[end]);
			
			if(arr[mid] >= 0) {
				start = mid +1;    
			}
			else {
				end = mid -1;       // at last end decrease because it satifies this case
			}
			
		}
		
		// start = first neg           end = first pos
		System.out.println("start :: "+start+"        end :: "+end);
		
		return arr.length-start;
	}

}
