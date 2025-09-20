package BinarySearch.array1d;

public class NearestTarget {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; //5
        // 2,5,6,12,13,55,77,77,77,81,86,100   target = 81
        //81
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        return -1;
    }
}
