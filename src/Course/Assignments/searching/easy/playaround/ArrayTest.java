package Course.Assignments.searching.easy.playaround;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		
		System.out.println("arr before:: "+Arrays.toString(arr));
		
		modifyArr(arr);
		
		System.out.println("arr after:: "+Arrays.toString(arr));
		
	}
	
	public static int modifyArr(int[] arr) {
		
		arr[0] = 9;
		return -1;
	}

}
