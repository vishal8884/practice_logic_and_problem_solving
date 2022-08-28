package Course.Assignments.searching.playAround;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		
	    mofidyArr(arr);
	    
	    System.out.println("arr :: "+Arrays.toString(arr));
	}
	
	public static void mofidyArr(int[] arr) {
		arr[1] = 5;
	}

}
