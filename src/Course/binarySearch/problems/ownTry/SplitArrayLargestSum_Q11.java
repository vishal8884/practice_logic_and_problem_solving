package Course.binarySearch.problems.ownTry;

public class SplitArrayLargestSum_Q11 {

	public static void main(String[] args) {

		int[] arr = {7,2,5,10,8};
		splitArray(arr, 2);
		//minimize the largest sum among these m subarrays.
	}

	public static int splitArray(int[] nums, int m) {

		int potentialMinAnswer = getPotentialMinAnswer(nums);  //when m=1...which is min possible                            //val = 10
		int potentialMaxAnswer = getPotentialMaxAnswer(nums);   //when m = arr.length ...which is max possible value of m    //val = 32
		
		//answer can lie between 10 and 32...ie potentialMinAnswer and potentialMaxAnswer
		//10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32     //len 23    mid= 22/2 = 11     arr[mid] = arr[11] = 21
		System.out.println("potentialMinAnswer :: "+potentialMinAnswer+"     potentialMaxAnswer :: "+potentialMaxAnswer);
		
		binarySearchWithTarget(nums,potentialMinAnswer,potentialMaxAnswer);
		
		return -1;
	}
	
	
	public static int binarySearchWithTarget(int[] nums,int start,int end) {
		
		int res =findTargetInArray(nums, 18, 2);
		System.out.println("res :: "+res);
		
		while(start<=end) {
			int mid = start + (end-start)/2;
		}
		
		return -1;
	}
	
	public static int findTargetInArray(int[] arr, int target, int m) {

		int partition = 0;
		int sum=0,maxSum=0,prevsum=0;
		for(int i=0;i<arr.length;i++) {
			prevsum=sum;
			sum = sum + arr[i];
			   
			if(sum > target) {
				partition++;
				if(sum > maxSum) {
					maxSum = prevsum;
				}
				sum=0;
				sum = sum +arr[i];
			}
			System.out.println("sum :: "+sum+"     prevsum :: "+prevsum+"      maxSum :: "+maxSum);
		}
		
		if(sum != 0)         //one more partition at end which sum < targer
			partition++;
		if(sum > maxSum)
			maxSum = sum;
		
		System.out.println("total partition :: "+partition+"       maxSum :: "+maxSum);
		
		if(partition == m && maxSum == target) {
			return 1;
		}
		
		return -1;
	}
	
	
	public static int getPotentialMaxAnswer(int[] nums) {
		int potentialMaxAnswer = 0;  //when m=1...which is min possible
		for(int i=0;i<nums.length;i++) {
			potentialMaxAnswer = potentialMaxAnswer + nums[i];
		}
		return potentialMaxAnswer;
	}
	
	public static int getPotentialMinAnswer(int[] nums) {
		int potentialMinAnswer = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]> potentialMinAnswer) {
				potentialMinAnswer = nums[i];
			}
		}
		return potentialMinAnswer;
	}

}
