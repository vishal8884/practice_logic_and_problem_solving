package Course.Assignments.searching.medium;

import java.util.Arrays;

public class Q10_KokoEatingBanannas {

	public static void main(String[] args) {

		int[] piles = {3,6,7,11};
		int[] piles2 = {30,11,23,4,20};
		int[] piles3 = {30,11,23,4,20};
		int[] piles4 = {312884470};
		int res = minEatingSpeed(piles, 8);
		
		System.out.println("res :: "+res);
		
	}

	public static int minEatingSpeed(int[] piles, int h) {
		
		int start = 1;
		int end = getMaxPile(piles);
		
		while(start <= end) {
			int mid = start + ((end - start)/2);
			
			System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end);
			
			if(isValidK(piles, h, mid)) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		
		
		return start;
	}

	
	//3,6,7,11
	public static boolean isValidK(int[] piles,int h,int k) {
		
		int hour = 0;
		
		for(int pile : piles) {
			if(k > pile) {
				hour = hour + k/pile;
				if(pile % k !=0) {
					hour++;
				}
			}
		}
		
		return hour <= h;
	}
	
	
	
	 private static int getMaxPile(int[] piles) {
	        int maxPile = Integer.MIN_VALUE;
	        for (int pile : piles) {
	            maxPile = Math.max(pile, maxPile);
	        }
	        return maxPile;
	    }
	
	
	
	////////////////////////////own code almost worked but slow...time limit exceed//////////////////////////////////////
	
	public static int minEatingSpeed_own(int[] piles, int h) {
		Arrays.sort(piles);   //4, 11, 20, 23, 30
		System.out.println("sorted Piles :: "+Arrays.toString(piles));   		System.out.println();
		
		int start = 0;
		int end = piles[piles.length-1]; 
		int ans = -1;
		
		//3,4,5,6,7,8,9,10,11
		
		while(start <= end) {
			int mid = start + (end - start)/2;  //mid will k ....ie no of bannas per hour
			int hourTakenToEat_withInputSpeed = getHourTakenToEat_withInputSpeed(piles,h,mid,start,end);
			
		//	System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"     hoursTakenToEat :: "+hourTakenToEat_withInputSpeed);
			System.out.println();
			
			if(hourTakenToEat_withInputSpeed < h) {   //need to reduce spped
                ans = mid;
				end = mid - 1;
			}
			else if(hourTakenToEat_withInputSpeed > h) {  // need to increase speed
				//ans = mid;
				start = mid + 1;
			}
			else {   //hourTakenToEat_withInputSpeed == h
				ans = mid;
			    end = mid -1;
			}
			
		}
		
		
		return ans;
	}
	
	
	public static int getHourTakenToEat_withInputSpeed(int[] piles, int h, int k,int start,int end) {
		//int k = 4;  //k bannas per hr
		int hour = 0;
		int i = 0;
		int remaining = 0;
		int remainingNote = 0;
		
		while(hour <= h && i < piles.length) {
			if(remaining != 0) {
				if(k >= remaining) {
					hour++;
					i++;
					remainingNote = remaining;
					remaining = 0;
				}
				else {
					hour++;
					remaining  = remaining - k;
				}
			}
			else if(k >= piles[i]) {
				hour++;
				i++;
			}
			else {  // k < piles[i]
				remaining = piles[i] - k;
				hour++;
			}
			
			System.out.println("hour :: "+hour+"    i :: "+i+"    reamining :: "+remaining+"     k :: "+k+"      remainingNote :: "+remainingNote+"     start ::"+start+"      mid :: "+k+"       end :: "+end);  // i willbe showing increased here
		    remainingNote = 0;
		}
		
		return hour;
	}

}












/*

public static int minEatingSpeed(int[] piles, int h) {
		Arrays.sort(piles);   //4, 11, 20, 23, 30
		System.out.println("sorted Piles :: "+Arrays.toString(piles));   		System.out.println();
		
		int start = 0;
		int end = piles[piles.length-1]; 
		int ans = -1;
		
		//3,4,5,6,7,8,9,10,11
		
		while(start <= end) {
			int mid = start + (end - start)/2;  //mid will k ....ie no of bannas per hour
			int hourTakenToEat_withInputSpeed = getHourTakenToEat_withInputSpeed(piles,h,mid,start,end);
			
		//	System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"     hoursTakenToEat :: "+hourTakenToEat_withInputSpeed);
			System.out.println();
			
			if(hourTakenToEat_withInputSpeed < h) {   //need to reduce spped
                ans = mid;
				end = mid - 1;
			}
			else if(hourTakenToEat_withInputSpeed > h) {  // need to increase speed
				//ans = mid;
				start = mid + 1;
			}
			else {   //hourTakenToEat_withInputSpeed == h
				ans = mid;
			    end = mid -1;
			}
			
		}
		
		
		return ans;
	}
	
	
	public static int getHourTakenToEat_withInputSpeed(int[] piles, int h, int k,int start,int end) {
		//int k = 4;  //k bannas per hr
		int hour = 0;
		int i = 0;
		int remaining = 0;
		int remainingNote = 0;
		
		while(hour <= h && i < piles.length) {
			if(remaining != 0) {
				if(k >= remaining) {
					hour++;
					i++;
					remainingNote = remaining;
					remaining = 0;
				}
				else {
					hour++;
					remaining  = remaining - k;
				}
			}
			else if(k >= piles[i]) {
				hour++;
				i++;
			}
			else {  // k < piles[i]
				remaining = piles[i] - k;
				hour++;
			}
			
			System.out.println("hour :: "+hour+"    i :: "+i+"    reamining :: "+remaining+"     k :: "+k+"      remainingNote :: "+remainingNote+"     start ::"+start+"      mid :: "+k+"       end :: "+end);  // i willbe showing increased here
		    remainingNote = 0;
		}
		
		return hour;
	}

*/