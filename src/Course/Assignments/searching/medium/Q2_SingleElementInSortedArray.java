package Course.Assignments.searching.medium;

public class Q2_SingleElementInSortedArray {

	public static void main(String[] args) {

		int[] arr = {1,1,2,3,3,4,4,8,8};   //mid = 4 ... arr[mid] =3    //find first non repeating elem  //1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8
		int[] arr2 = {1,1,2,2,3};
		int[] arr3 = {1,1,2,3,3};
		int[] arr4 = {0,1,1};
		int res = singleNonDuplicate(arr);
		System.out.println("res :: "+res);
	}

	//first we check if its first no or second no...eg (3,3)
	//if last no we move to first and check if even or odd
	//if even....order looks fine in left...so start = mid +1;
	//if odd ....order is incorrect so sol is present left...so elemitae first half...end = mid -1;
	public static int singleNonDuplicate(int[] nums) {             //binary enhanced approach try //tbc  //
		
		int len = nums.length;
		
		if(len == 1) return nums[0];
		
		if(nums[0] != nums[1]) {                //first elem check (0)
			return nums[0];
		}
		if(nums[nums.length-1] != nums[nums.length-2]) {       //last elem check (nums.length -1)
			return nums[nums.length-1];
		}
		
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"       mid :: "+mid+"       end :: "+end+"      midval :: "+nums[mid]);
			
			if(mid == 1 && nums[mid] == nums[mid-1]) {
				start = mid +1;
			}
			if(mid == 1 && nums[mid] != nums[mid-1]) {
				return nums[1];
			}
			
			if(nums[mid] == nums[mid-1]) {
				mid--;
			}
			if(mid!=0 && nums[mid] != nums[mid-1]) {
				if(mid < nums.length-1 && nums[mid] != nums[mid+1]) {
					return nums[mid];
				}
				if(mid%2 == 0) {
					mid++;
					start = mid +1;
				}
				else {
					end = mid -1;
				}
			}
			
		}
		
		return nums[start];
	}
	
	////////////////////////////////////////////////Linear approach 2ms /////////////////////////////////////////////////////////////////////////////
	
	
	public static int singleNonDuplicateLinear(int[] nums) {         //brute force
		if(nums.length == 1) {
			return nums[0];
		}
		
		for(int i=0;i<nums.length;i++) {
			
			if(i!=0 && i!= nums.length-1 && (nums[i] != nums[i-1] && nums[i] != nums[i+1])) {
				return nums[i];
			}
		}
		
		if(nums.length>1 && nums[0] != nums[1]) {
			return nums[0];
		}
		if(nums.length>1 && nums[nums.length-2] != nums[nums.length-1]) {
			return nums[nums.length-1];
		}
		
		return -1;
	}
	
	///////////////////////////////////////Smae binary but code is good///////////////////////////////
	
	public int singleNonDuplicate2(int[] nums) {  //1,1,2,3,3,4,4,8,8   .. //1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8
		int lo = 0;
		int hi = nums.length - 1;
		while(lo < hi){
			int mid = lo + (hi - lo)/2;
						   
			if(mid % 2 == 0){   //even means left side looks fine
				// if mid in at even index and assume the single element is not in the left part(nums[0 : mid + 1] inclusively)
                // the number in mid and the next number should be the same; otherwise, it is in the left part: nums[0 : mid] inclusively
				if(nums[mid] == nums[mid + 1]){
					lo = mid + 2;
				}else{
					hi = mid;
				}
			}else{                            // odd means left side looks suspicious..unless its second occurance ie(3,3)
				// similar logic as above
				if(nums[mid] == nums[mid - 1]){
					lo = mid + 1;
				}else{
					hi = mid;
				}
			}

		}
		return nums[lo];
	}

}



/*

int start = 0;
		int end = nums.length - 1;
		int c=0;
		
		while(start <= end) {
			c++; if(c==20) break;
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"       mid :: "+mid+"       end :: "+end+"      midval :: "+nums[mid]);
			
			if(mid>1 && nums[mid - 1] == nums[mid]) {
				mid  = mid -1;
				if(mid % 2 !=0) {
					System.out.println("sol present");
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
			else {
				if(mid % 2 !=0) {
					System.out.println("sol present2");
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
		}
		
		return -1;
*/