package Course.Assignments.searching.easy;

import java.util.Arrays;

public class Q14_CheckIfNandItsDoubleExists {

	public static void main(String[] args) {

		int[] arr = {10,2,5,3};
		int[] arr2 = {7,1,14,11};   //1,7,11,14
		int[] arr3 = {-16,-13,8}; //-19,-8,-2,0,4,6,10
		int[] arr4 = {0,0};
		int[] arr5 = {-2,0,10,-19,4,6,-8};
		boolean res = checkIfExist(arr5);
		
		System.out.println("res :: "+res);
	}

	
	 public static boolean checkIfExist(int[] arr) {                 //own working but slow
		 Arrays.sort(arr); // 2,3,5,10   //-19, -8, -2, 0, 4, 6, 10
		 
		 for(int i=0;i<arr.length;i++) {

			 
			 int target = arr[i]*2;
			 int start = 0;
			 int end = arr.length-1;
			 
			 while(start <= end) {
				 int mid = start + (end-start)/2;

				 System.out.println("arr[i]  :: "+arr[i]+"    start :: "+start+"     mid :: "+mid+"       end ::" +end+"    midval ::  "+arr[mid]+"      target :: "+target+"     i :: "+i);
				 
				 if(mid!=i && arr[mid] == target) {
					 return true;
				 }
				 if(arr[mid] < target) {
					 start = mid + 1;
				 }
				 else {
					 end = mid - 1;
				 }
			 }
			 System.out.println();
		 }
		 
		 return false;
	}
    
    
	public static boolean binarySearchPossibleSols(int[] arr,int target) {
		int start = 0;
		int end = arr.length -1;
		
		System.out.println("arr :: "+Arrays.toString(arr)+"        target :: "+target);
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"       mid :: "+mid+"       end :: "+end+"         midval :: "+arr[mid]);
			
			if(arr[mid] == target) {
				return true;
			}
			if(arr[mid] < target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		return false;
	}
	
   
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
	public static boolean checkIfExistLinear(int[] arr) {          //linear
		
		//Arrays.sort(arr);  //2,3,5,10   //-20,-10,-8,12,15
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0 ;j<arr.length;j++) {
				System.out.println("i :: "+i+"     j :: "+j+"      arr[i] :: "+arr[i]+"       arr[i]*2 :: "+arr[i]*2+"       arr[j] :: "+arr[j]);
				if(i!=j && arr[i]*2 == arr[j]) {
					return true;
				}
			}
		}
		
		return false;
	}

}


/*
 * 
 * public static boolean checkIfExist(int[] arr) {          //binary
		
		Arrays.sort(arr);  //2,3,5,10 
		
		int minPossible = arr[0]*2;             //2*2  = 4
		int maxPossible = arr[arr.length-1]*2;  //10*2 = 20
		
		//possible sols     4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20


		
		int start1 = 0;
		int end1 = arr.length-1;
		
		while(start1 <= end1) {
			int mid1 = start1 + (end1-start1)/2;

			//another while loop
			while(minPossible <= maxPossible) {
				int mid2 = minPossible + (maxPossible - minPossible)/2;
				
				if(mid2*2 == arr[mid1]) {
					return true;
				}
				if(mid2*2 > arr[mid1]) {
					minPossible = mid2 + 1;
				}
				else {
					maxPossible = mid2 - 1;
				}
			}
			
			
		}
		
		return false;
	}
 */

/////////////////////////////////////////////////////////////////////




/*
public static boolean checkIfExist(int[] arr) {          //binary
		
		Arrays.sort(arr);  //2,3,5,10 
		
		int minPossible = arr[0]*2;             //2*2  = 4
		int maxPossible = arr[arr.length-1]*2;  //10*2 = 20
		
		//possible sols     4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
		int[] possiblesols = new int[maxPossible-minPossible+1];
		for(int i =0;i<possiblesols.length;i++) {
			possiblesols[i] = minPossible;
			minPossible++;
		}
		
		System.out.println("possiblesols :: "+Arrays.toString(possiblesols));
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;

			int posSol = binarySearchPossibleSols(possiblesols, arr[mid]);
			
			if(arr[mid]*2 == 12) {
				return true;
			}
			if(arr[mid] > 12) {
				
			}
			else {
				
			}
		}
		
		return false;
	}
    
    
	public static int binarySearchPossibleSols(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(mid*2 == target) {
				return mid;
			}
			if(mid*2 > target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		return -1;
	}
*/