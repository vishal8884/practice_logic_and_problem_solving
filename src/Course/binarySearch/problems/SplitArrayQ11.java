package Course.binarySearch.problems;

public class SplitArrayQ11 {

	public static void main(String[] args) {

		int[] arr = {7,2,5,10,8};
		int res =splitArray(arr,2);
		
		System.out.println("res :: "+res);
	}
	
	public static int splitArray(int[] nums,int m) {
		
		int start =0;
		int end =0;
		
		for(int i=0;i<nums.length;i++) {
			start = Math.max(start, nums[i]); //in the end start will have max val
			end += nums[i];
		}

		// min m val  m = 1                  partition = (7,2,5,10,8)          so largest sum in partition is sum(arr) = 32   which is min among the partition
		// max m val  m = arr.length = 5     partition (7) (2) (5) (10) (8)    so max sum of the partition is 10      ...which is the only possible one
		
		//binary search the ans between 10 and 32
		while(start<end) {
			//mid is potential answer
			int mid = start + (end -start)/2;
			
			//calculate how many pieces you can divide this in with max sum
			//7,2,5,10,8
			//10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32     //len 23    mid= 22/2 = 11     arr[mid] = arr[11] = 21
			// lesser the number more the pieces...follow that logic
			int sum=0;
			int pieces = 1;
			
			for(int num : nums) {
				if(sum + num > mid) {       //we cannot add this in new sum...need to create new peice    // assume mid ==21
					sum = num;              
					pieces++;
					System.out.println("start :: "+start+"     mid :: "+mid+"    end :: "+end+"      sum :: "+sum+"     pieces :: "+pieces);
				}
				else {
					sum += num;
					System.out.println("start :: "+start+"     mid :: "+mid+"    end :: "+end+"      sum :: "+sum+"     pieces :: "+pieces);
				}
			}
			System.out.println();
			
			if(pieces > m) {                 // pieces greater than m....so we can ignore mid and left elements
				start = mid +1;               // assume mid =12 then there will be 4 pieces (7,2) (5) (10) (8)   ...so obviosuly mid should we greater than current mid
			}
			else {                 //pieces <= m ... pieces are m or greater means answer and be lesser than or equal to middle...so the right side can be ignored
				end = mid;         // assume mid = 21 then there will be so there will be 2 pieces  (7,2,5) (10,8)  .. so answer can be this or less than this
			}
			
		}
		
		return start;
	}

}
