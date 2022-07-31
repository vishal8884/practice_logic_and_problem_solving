package Course.binarySearch.problems;

public class PeakIndexInMountain_Q6 {

	public static void main(String[] args) {

        //0,1,2,3,4 ,5 ,6 ,7 ,8,9,10,11
		int[] arr = {0,1,2,3,12,15,20,24,8,3,1 ,0};
		//int[] arr = {40,48,61,75,100,99,98,39,30,10};
		int res = peakIndexInMountainArray(arr);
		System.out.println("res :: "+res);
	}
	
    public static int peakIndexInMountainArray(int[] arr) {          //worked in leet code own
		
    	
    	int start =0;
    	int end = arr.length-1;
    	
    	while(start<end) {
    		int mid = start + (end-start)/2;
    		System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"        mid val :: "+arr[mid]);
    		
    		if(arr[mid] > arr[mid+1]) {           // this might be the answer...so not doing mid -1; ...ie coming backwards
    			end = mid;
    		}
    		else{
    			start = mid +1;                   // arr[mid] > arr[mid+1] ..this is in proper asscending order so we eliminate it from start to mid (incl mid)
    		}
    	}
    	
		return start;       //start and end will be equal as while(start<end)
    }

}
