package Course.Assignments.searching.medium;

import java.util.Arrays;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/discuss/256729/JavaC%2B%2BPython-Binary-Search
public class Q16_CapacityToShipPackage {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int res = shipWithinDays(arr,5);
		
		System.out.println("res :: "+res);
	}

	public static int shipWithinDays(int[] weights, int days) {

		int start = 0;  //max elem
		int end = 0;  //sum of all elem
		
		for(int w : weights) {
			start = Math.max(w,start);
			end = end + w;
		}
		
		System.out.println("weights :: "+Arrays.toString(weights)+"      start :: "+start+"     end :: "+end); System.out.println();
		
		
		while(start < end) {
			int mid = start + (end - start)/2;
			System.out.println("start :: "+start+"      mid :: "+mid+"        end :: "+end);
			
			int dayCounter=1;   // this is used to check if day exceeds or left with the given days in input
			int weightSum = 0;  // this is used to determine max possible weight for sub array
			
			for(int weight : weights) {
				if(weightSum + weight > mid) {
					
					weightSum = 0;
					dayCounter++;
				}
				weightSum = weightSum + weight;
			}
			
			if(dayCounter > days) {
				start = mid + 1;        // if no of days taken is greater than requiredDays  ...this is not at all possible eg mid =12 where daycounter is 7 days
			}
			else {
				end = mid;              //if no of days taken is less than requiredDays..........this might be answer as it takes less than given days
			}
			
		}
		
		System.out.println("start :: "+start+"     end :: "+end);   // start and end same
		
		return end;
	}

}
