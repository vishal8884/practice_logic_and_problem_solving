package Course.binarySearch.problems.ownTry;

public class PeakIndexInMountainArray_Q5 {

	public static void main(String[] args) {
                   //0,1,2,3,4 ,5 ,6 ,7 ,8,9,10,11
		int[] arr = {0,1,2,3,12,15,20,24,8,3,1 ,0};
		//int[] arr = {40,48,61,75,100,99,98,39,30,10};
		int res = peakIndexInMountainArray(arr);
		System.out.println("res :: "+res);
	}

	
	public static int peakIndexInMountainArray(int[] arr) {          //WORKED IN LEETCODE own
		
		int start = 0;
		int end = arr.length-1;
		int max = -1,maxVal =-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"           mid val :: "+arr[mid]);
			if(mid<arr.length-1 && arr[mid] > maxVal) {                  //3) we are taking out the max vals out of the mid we saw and store it
				max = mid;
				maxVal = arr[mid];
			}
			if(mid+1 >= arr.length-1) {                                  //4) if the mid exceeds arr length then we return result
				return max;
			}
			if(arr[mid] < arr[mid+1]) {        //1) if arr[mid] is less than its next we eliminate all left elements of mid along with mid
				start = mid +1;
			}
			else if(arr[mid] > arr[mid+1]) {     //2) if arr[mid] is greater than its next we eliminate all right elements of mid along with mid
				end = mid -1;
			} 
			
		}
		return max;                                                        //4) at last we return the max
    }

	
	
	public static int peakIndexInMountainArrayLinerarWorking(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				return i;
			}
		}
		
		return -1;
	}

}





//      #1
//int start = 0;
//int end = arr.length-1;
//while(start<=end) {
//	int mid = start + (end-start)/2;
//	System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"           mid val :: "+arr[mid]);
//	if(arr[mid] < arr[mid+1]) {
//		start = mid +1;
//	}
//	else if(arr[mid] > arr[mid+1]){
//		return mid;
//	}
//	else if( (start == mid || end == mid) && arr[mid] > arr[mid+1]) {
//		return mid;
//	}
//	else {
//		return mid;
//	}
//}
//
//return -1;



////////////////// #2

//public static int binarySearch(int[] arr) {
//
//	int start = 0;
//	int end = arr.length-1;
//	int res = 0;
//	
//	while(start<=end) {
//		int mid = start + (end-start)/2;
//		System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"           mid val :: "+arr[mid]);
//		if((mid+1 < arr.length-1) && arr[mid] < arr[mid+1]) {
//			start = mid +1;
//			res=mid;
//		}
//		else if((mid+1 < arr.length-1) && arr[mid] > arr[mid+1]) {
//			end = mid -1;
//			res=mid;
//		} 
//		
//	}
//	
//	return res;
//}