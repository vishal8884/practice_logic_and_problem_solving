package Course.Assignments.searching.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q13_FairCandySwap {

	public static void main(String[] args) {

		int[] aliceSizes = {1,2};  //3
		int[] bobSizes = {2,3};    //4
		
		int[] aliceSizes2 = {4,10,17,24,35};  // sum = 90
		int[] bobSizes2 = {21,63};    // sum = 84                                          //24,21   sumreplaced = 87
		
		int[] aliceSizes3 = {1,2,5};  // 9
		int[] bobSizes3 = {2,4};    // 6
		
		int[] res = fairCandySwapBinary(aliceSizes2, bobSizes2);
		System.out.println("res :: "+Arrays.toString(res));
	}
	

	public static int[] fairCandySwapBinary(int[] arr1, int[] arr2) {    
	
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum1 = IntStream.of(arr1).sum();
		int sum2 = IntStream.of(arr2).sum();
		
		int sum1ReplacedMin = (sum1-arr1[0]) + arr2[0];
		int sum2ReplacedMin = (sum2-arr2[0]) + arr1[0];
		int sumReplacedMin = Math.min(sum1ReplacedMin, sum2ReplacedMin);
		
		int sum1ReplacedMax = (sum1-arr1[arr1.length-1]) + arr2[arr2.length-1];
		int sum2ReplacedMax = (sum2-arr2[arr2.length-1]) + arr1[arr1.length-1];
		int sumReplacedMax = Math.max(sum1ReplacedMax, sum2ReplacedMax);
		
		System.out.println("sum1ReplacedMin :: "+sum1ReplacedMin+"    sum2ReplacedMin :: "+sum2ReplacedMin+"    sum1ReplacedMax :: "+sum1ReplacedMax+"     sum2ReplacedMax :: "+sum2ReplacedMax);
		System.out.println("sumReplacedMin :: "+sumReplacedMin+"    sumReplacedMax :: "+sumReplacedMax);
		
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int[] fairCandySwap(int[] arr1, int[] arr2) {          //two pointer approach   24-28ms
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       int sum1 = IntStream.of(arr1).sum();
		int sum2 = IntStream.of(arr2).sum();
		
		int i=0,j=0;
		
		while(i < arr1.length && j < arr2.length) {
			
			int sum1Replaced = (sum1-arr1[i]) + arr2[j];
			int sum2Replaced = (sum2-arr2[j]) + arr1[i];
			
			System.out.println("i :: "+i+"     j :: "+j+"    sum1Replaced :: "+sum1Replaced+"     sum2Replaced :: "+sum2Replaced);
			
			if(sum1Replaced == sum2Replaced) {
				return new int[] {arr1[i],arr2[j]};
			}
			if(sum1Replaced > sum2Replaced) {       //if sum1replaced is greaer and sumwreplaced is smaller we need to move to next as we nned to reduce sum1replaced
				i++;                                // and increase sum2replaced
			}
			else {
				j++;
			}
		}
		
		return null;
    }
	
	
   public int[] fairCandySwap3(int[] arr1, int[] arr2) {        //nested for loop ...very slow 336ms brute force
        
        int sum1 = IntStream.of(arr1).sum();
		int sum2 = IntStream.of(arr2).sum();
        
        for(int i=0;i <arr1.length; i++) {
			for(int j=0;j <arr2.length; j++) {
				if((sum1-arr1[i]) + arr2[j] == (sum2-arr2[j])+arr1[i]) {
				    return new int[] {arr1[i],arr2[j]};
		     	}
			}
		}
		
		return new int[] {-1,-1};
    }
	

}

/*
 * 
 * Sa -A + B = Sb -B+A
   2(A-B) = (Sa-Sb)
   A-B = (Sa-Sb)/2
   A = B+(Sa-Sb)/2
 * private int binarySearch(int[] arr,int target){ 
        int s=0,e = arr.length-1;
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
            
        }
        return -1;
    }
    
    public int[] fairCandySwap(int[] a, int[] b) { //a = Alice , b=Bob
        int suma=0,sumb=0;
        for(int i=0;i<a.length;i++)
            suma+=a[i];
        for(int i=0;i<b.length;i++)
            sumb+=b[i];
        
        int diff = (suma-sumb)/2;
        
        Arrays.sort(a);
        for(int num:b){
            if (binarySearch(a,num+diff) !=-1) return new int[]{num+diff,num};
        }
        
        return null;
        
    }
 */


//public static int[] fairCandySwap(int[] arr1, int[] arr2) {    //two pointer approach
//
//	int sum1 = IntStream.of(arr1).sum();
//	int sum2 = IntStream.of(arr2).sum();
//	int i,j;
//	
//	if(sum2 < sum1) {
//		i = arr1.length-1;     //assume this case
//		j=0;
//	}
//	else {
//		i = 0;
//		j = arr2.length; 
//	}
//	
//	boolean ijcase = false;
//	
//	if(i==0) {
//		ijcase = i < arr1.length && j >= 0;
//	}
//	else if(j==0) {
//		ijcase = i >= 0 && j < arr2.length;;
//	}
//	
//	while(ijcase) {
//		
//		int sum1Replaced = (sum1-arr1[i]) + arr2[j];
//		int sum2Replaced = (sum2-arr2[j]) + arr1[i];
//		
//		System.out.println("i :: "+i+"     j :: "+j+"    sum1Replaced :: "+sum1Replaced+"     sum2Replaced :: "+sum2Replaced);
//		
//		if((sum1-arr1[i]) + arr2[j] == (sum2-arr2[j])+arr1[i]) {
//			return new int[] {arr1[i],arr2[j]};
//		}
//		if((sum1-arr1[i]) + arr2[j] > (sum2-arr2[j])+arr1[i]) {
//			i++;
//		}
//		else {
//			j++;
//		}
//	}
//	
//	return null;
//}

/*
public static int[] fairCandySwapSlow(int[] aliceSizes, int[] bobSizes) {    //two pointer approach

		for(int i=0;i <aliceSizes.length; i++) {
			for(int j=0;j <bobSizes.length; j++) {
				int temp = aliceSizes[i];
				int temp2 = bobSizes[j];
				aliceSizes[i] = bobSizes[j];
				bobSizes[j] = temp;
				int a = IntStream.of(aliceSizes).sum();
				int b = IntStream.of(bobSizes).sum();
				
				if(a == b) {
					return new int[] {temp,temp2};
				}
				else {
					aliceSizes[i] = temp;
					bobSizes[j] = temp2;
				}
			}
		}
		
		return null;
	}
*/