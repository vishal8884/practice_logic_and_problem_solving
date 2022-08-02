package OtherPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] arr2 = { 1, 7, 3, 6, 5, 6 };
		int[] arr = {1,2,3};                 //need to revisit this
		int[] arr3 = {-1,-1,-1,-1,0,1};      
		int[] arr4 = {2,1,-1};
		int res = pivotIndex(arr3);
		
		System.out.println("res :: "+res);
	}

	public static int pivotIndex(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		int frontSum =0,prevFrontSum =0;
		int backSum=0,prevBackSum=0;
		boolean firstPrevback=true;
		boolean firstPrevfront = true;
		
		int res = -1;
		
		while(start<=end) {
			
			prevFrontSum = frontSum;
			
			frontSum = frontSum + arr[start];
			
			prevBackSum = backSum;
			
			backSum = backSum + arr[end];
			
			System.out.println("frontsum :: "+frontSum+"     prevFrontSum :: "+prevFrontSum+"    backSum :: "+backSum+"    prevBackSum :: "+prevBackSum+"     start :: "+start+"     end :: "+end);
			
			if(prevBackSum == frontSum && !firstPrevback) {
				if(arr[start] !=arr[end])
				   return start +1;
			}
			if(prevFrontSum == backSum && !firstPrevfront) {
				res= start;
			}
			if(backSum == 0 && end == 1) {
				return 0;
			}
			start++;
			end--;
			firstPrevfront=false;
			firstPrevback=false;
		}
		
		return res;
	}

}

/*
int start =0;
int end = arr.length-1;

int frontSum =0;
int backSum=0;

List<Integer> sumList = new ArrayList<>();

while(start<=end) {
	
	frontSum = frontSum + arr[start];
	sumList.add(frontSum);
	
	backSum = backSum + arr[end];
	if(sumList.contains(frontSum)) {
		
	}
	
	System.out.println("frontSum :: "+frontSum+"     backSum :: "+backSum+"       start :: "+start+"      end :: "+end);
	
	start++;
	end--;
}

return -1;*/

//public static int pivotIndex(int[] arr) {
//
//	int start =0;
//	int end = arr.length-1;
//	
//	int frontSum =0;
//	int backSum=0;
//	
//	while(start<=end) {
//		
//		frontSum = frontSum + arr[start];
//		backSum = backSum + arr[end];
//		
//		System.out.println("frontSum :: "+frontSum+"     backSum :: "+backSum);
//		
//		start++;
//		end--;
//	}
//	
//	return -1;
//}








/*
public static int pivotIndex(int[] arr) {
	
	int start =0;
	int end = arr.length-1;
	
	int frontSum =0;
	int backSum=0;
	
	int[] frontSums = new int[arr.length];
	int[] backSums = new int[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		frontSum = frontSum + arr[i];
		frontSums[i] = frontSum;
	}
	for(int i=arr.length-1;i>=0;i--) {
		backSum = backSum + arr[i];
		backSums[i] = backSum;
	}
	
	for(int i=0;i<frontSums.length;i++) {
		for(int j=backSums.length-1;j>=0;j--) {
			if(frontSums[i] == backSums[j]) {
				System.out.println("i ::"+i+"       j :: "+j);
				return i+1;
			}
		}
	}
	
	return -1;
}*/
