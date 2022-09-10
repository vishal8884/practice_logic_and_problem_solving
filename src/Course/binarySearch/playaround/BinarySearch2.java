package Course.binarySearch.playaround;

import java.util.Arrays;

public class BinarySearch2 {

	public static void main(String[] args) {

		int[] arr = {1,3,5,7,8,10,13};
		int res = performBinarySearch(arr, 2);
		
		System.out.println("res :: "+res);
	}

	public static int performBinarySearch(int[] arr, int target) {
		System.out.println("arr :: "+Arrays.toString(arr)); System.out.println();
		
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println("start :: " + start + "     mid :: " + mid + "      end :: " + end + "     midval :: " + arr[mid]);

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				start = mid + 1;
				break;
			}
		}
		
		System.out.println();
		int[] insetAndmoveElemRight = insetAndmoveElemRight(arr, start, target);
		System.out.println("start :: "+start+"    end :: "+end+"   insetAndmoveElemRight :: "+Arrays.toString(insetAndmoveElemRight));
		
		
		return -1;
	}
	
	
	public static int[] insetAndmoveElemRight(int[] arr,int fromPos,int insert) {
		int[] res = new int[arr.length+1];
		int x = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(i<fromPos || i>fromPos) {
				res[x] = arr[i];
				x++;
			}
			else if(i == fromPos) {
				res[x] = insert;
				x++;
				res[x] = arr[i];
				x++;
			}
			
		}
		
		//System.out.println("res :: "+Arrays.toString(res));
		return res;
	}

}
