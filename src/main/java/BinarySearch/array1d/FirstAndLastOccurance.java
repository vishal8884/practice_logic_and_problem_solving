package BinarySearch.array1d;

public class FirstAndLastOccurance {


    /**
     *
     *
     * -> We write 2 while loops
     * -> first one keeps going left (reducing high) enven if target is found so that we can reach till first occurance
     * -> Second one keeps going right (increasing low) even if we found the target so that we can reach till last occurance
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int low =0;
        int high = nums.length -1;
        int lastPos = -1;
        int firstPos = -1;


        //find first occurance
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                firstPos = mid;
            }
            if(nums[mid] >= target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
        }
        //1,2,6,6,6,6,8,9,10,12,15,20,26,70,88
        //1,2,6,6,6,6,8
        low =0;
        high = nums.length -1;
        //find last occurance
        while(low <= high){
            int mid = (low + high)/2;
            //System.out.println("low :: "+low+"     mid :: "+mid+"    high :: "+high+"    firstPos :: "+firstPos);
            if(nums[mid] == target){
                lastPos = mid;
            }
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] <= target){
                low = mid + 1;
            }
        }
        return new int[]{firstPos,lastPos};
    }



}
