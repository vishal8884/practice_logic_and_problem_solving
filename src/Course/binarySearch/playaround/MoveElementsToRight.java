package Course.binarySearch.playaround;

import java.util.Arrays;

public class MoveElementsToRight {

	public static void main(String[] args) {

		int[] arr = {1,3,5,7,8,10,13};
		insetAndmoveElemRight(arr,1,2);
	}
	
	
	public static void insetAndmoveElemRight(int[] arr,int fromPos,int insert) {
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
		
		System.out.println("res :: "+Arrays.toString(res));
	}

}
