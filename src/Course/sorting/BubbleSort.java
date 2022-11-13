package Course.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {4,2,5,3,1};
		int[] arr2 = {5,4,3,2,1};
		
		System.out.println("arr before sort :: "+Arrays.toString(arr));
		bubbleSortSlow(arr);
		System.out.println("arr after sort :: "+Arrays.toString(arr));
	}
	
	
    public static void bubbleSort(int[] arr) {
    	boolean isSwapped;
    	
    	for(int i=0;i<arr.length;i++) {
    		isSwapped = false;
    		for(int j=1;j<arr.length-i;j++) {
    			if(arr[j-1] > arr[j]) {
    				int temp = arr[j-1];
    				arr[j-1] = arr[j];
    				arr[j] = temp;
    				isSwapped = true;
    			}
    		}
    		
    		if(!isSwapped) {
    			return;
    		}
    	}
		
	}
    
    /*
     * in each step greatest num is put into its place ie from last
     * 
     * | is wall and the part next to it is ignored as its already sorted
     * 
     * i=0          j < arr.length - i      j < 5 - 0 = 5      j < 5    4,2,5,3,1|
     * 
     * i=1          j < arr.length - i      j < 5 - 1 = 4      j < 5    2,4,3,1,|5
     * 
     * i=2          j < arr.length - i      j < 5 - 2 = 3      j < 5    2,3,1,|4,5
     * 
     * i=3          j < arr.length - i      j < 5 - 3 = 2      j < 5    2,1,|3,1,5
     */
	
	public static void bubbleSortSlow(int[] arr) {    //4,2,5,3,1
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				System.out.println("arr between :: "+Arrays.toString(arr)+"      arr[i] :: "+arr[i]+"     arr[j] :: "+arr[j]);
			}
		}
		
	}

}
