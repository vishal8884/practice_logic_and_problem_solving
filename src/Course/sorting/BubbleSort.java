package Course.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {4,2,5,3,1};
		int[] arr2 = {5,4,3,2,1};
		
		System.out.println("arr before sort :: "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("arr after sort :: "+Arrays.toString(arr));
	}
	
	
    public static void bubbleSort(int[] arr) {
    	
    	boolean swapped;
    	
    	for(int i=0;i<arr.length;i++) {    //i is just used as wall in below loop so that it can avoid already sorted part
    		swapped = false;
    		for(int j=1;j<arr.length-i;j++) {   //arr.length - i because of wall
    			if(arr[j-1]>arr[j]) {
    				int temp = arr[j];
    				arr[j] = arr[j-1];
    				arr[j-1] = temp;
    				swapped=true;
    			}
    		}
    		if(!swapped) {
    			return;
    		}
    	}
		
	}
    
    /*
     * | is wall and the part next to it is ignored as its already sorted
     * 
     * i=0          j < arr.length - i      j < 5 - 0 = 5    4,2,5,3,1|
     * 
     * i=1          j < arr.length - i      j < 5 - 1 = 4    2,4,3,1,|5
     * 
     * i=2          j < arr.length - i      j < 5 - 2 = 3    2,3,1,|4,5
     * 
     * i=3          j < arr.length - i      j < 5 - 3 = 2    2,1,|3,1,5
     */
	
	public static void bubbleSortSlow(int[] arr) {
		
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
