package Course.Assignments.searching.easy;

import java.util.ArrayList;
import java.util.List;

public class Q7_KthMissingPositiveNumber {

	public static void main(String[] args) {

		int[] arr = {2,3,4,7,11};
		int[] arr3 = {2};
		int[] arr4 = {6,7,10,20,28,29,33,37,39,40,49,53,55,72,75,76,85,87,88,94,106,107,119,120,129,142,147,152,157,159,161,173,178,183,187,188,193,199,202,212,215,224,227,230,237,239,246,251,256,260,266,268,273,277,279,281,291,297,298,310,312,314,315,321,324,326,329,341,342,348,355,367,370,374,387,389,394,413,420,424,429,446,447,458,460,464,467,473,477,478,498,500,501,503,514,515,523,525,528,529,531,535,539,555,566,569,572,583,588,591,596,602,604,605,606,610,611,616,619,622,623,631,632,640,642,645,647,661,680,684,685,687,694,696,698,714,717,720,726,734,738,742,745,753,770,775,780,781,783,787,788,798,806,821,835,852,865,873,888,897,926,932,935,939,945,956,966,967,969,973,979,980,986,992,995,997};
		int[] arr5 = {7,13,21,25,29,32,38,45};
		int[] arr2 = {2,3,5,9,10,11,14,29,33};    
		//  1,4,6,7,8,12,13,15,16,17,18,19,20,21,23,24,25,26,27,28,31,32,34.........       //res = 14   for k=8
		int res = findKthPositive(arr2,8);      //need to find 5th missing element
		System.out.println("res :: "+res);
	}
	
	// approach explained
	// we are going to binary search 2 elem btw which ans can exist
	// here its between 14 (at 6) and 29 (at 7)  as before 14 ..7 elem missed    and before 29 ...21 elem missed
	// so ans next to 14 by k - elem missed(7)  ....ie 14 + (k-elemmissed)  =  14 + (8-7) = 14 +1 =15
    public static int findKthPositive(int[] arr, int k) {           //binary approach   //eg for arr2={2,3,5,9,10,11,14,29,33}   k=8
        
    	int start =0;
    	int end = arr.length -1;
    	
    	while(start <= end) {
    		
    		int mid = start + (end -start)/2;
    		int missed_count_till_mid = arr[mid] - (mid+1);    // this finds how many elem missed till mid (eg for 10... 5 missed ie 1,4,6,7,8)
    		System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"    midval :: "+arr[mid]+"     missed_count_till_mid :: "+missed_count_till_mid);
    		
    		if(k == missed_count_till_mid) {
    			
    			if(mid > 0 && (arr[mid-1] == arr[mid]-1)) {
    				end = mid -1;
    				continue;
    			}
    			
    			return arr[mid]-1;
    		}
    		if(k < missed_count_till_mid) {   // if k is less than the missedcount... so ans cant lie on right of it
    			end = mid - 1;
    		}
    		else if(k > missed_count_till_mid) {  // if k is greater than the missedcount... so ans cant lie on left of it
    			start = mid + 1;
    		}                                     
    	}
    	
    	if(end < 0)          //its not found
    		return k;
	                                                   // actualy end should be end = 7 .....as loop executes one more time for (k< missed)  end = 6
    	int missed_count_at_end = arr[end] - (end+1);  // at last there will be one arr[mid] left  .. here end = 6 and arr[end] = 14
    	                                               // so ans should be next to it by k  ( already missed_count_at_end done so
    	                                               // remaining.... k - missed_count_at_end = 8 - 7 = 1 ....therefor ans = arr[end] + 1
    	k = k- missed_count_at_end;
    	System.out.println("end :: "+end+"      missed_count_at_end :: "+missed_count_at_end+"    k :: "+k);
    	
	    return arr[end]+k;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////
	
   public static int findKthPositive2(int[] arr, int k) {           //binary approach 
        
    	int start = 0;
    	int end = arr.length - 1;
    	
    	while(start <= end) {
    		
    		int mid = start + (end - start)/2;   // mid will be 10
    		int missedElem_till_mid = arr[mid] - (mid+1);     // =5 this will have the no of elem missed till 10  .... ie 10 - (4+1)    .... arr[mid] = 10   mid = 4
    		
    		System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"          midval :: "+arr[mid]+"      missedvals :: "+missedElem_till_mid);
    		
    		
    		if(k == missedElem_till_mid) {
    			if(mid > 0 && (arr[mid - 1] == arr[mid] - 1))   //(mid > 0 && (arr[mid - 1] - (mid)) == k)
    	        {
    	          end = mid - 1;
    	          continue;
    	        }
    			
    			return arr[mid] - 1;
    		}
    		if(k < missedElem_till_mid) {
    			end = mid - 1;
    		}
    		else if(k > missedElem_till_mid) {
    			start = mid + 1;
    		}
    		
    	}
    	
    	if(end < 0)
    		return k;
    	
    	int missed_vals = arr[end] - (end+1);
    	k = k-missed_vals;
    	System.out.println("end :: "+end+"      missed_vals :: "+missed_vals+"        k :: "+k);
    	
    	return arr[end]+k;
    }
	
	
	
	
	
	
	
	
	//////////////////////// Linear approach //////////////////////////////////////////////////////////////
	
	
    public static int findKthPositiveLinear(int[] arr, int k) {           //linear naive approach O(n)      ..own working 0ms    //2,3,4,7,11
        
    	int x=0;
    	int i=1;
    	int counter =1;
    	
    	while(true) {
    		
    		
    		if(arr[x] != i) {                                   // case 1 : number not present
    			if(counter == k) {
    				return i;
    			}
    			i++;
    			counter ++;
    		}
    		else if(x < arr.length-1 && arr[x] == i) {          // case 2 : number present    ...checks till 7 as x++ is there in this loop
    			x++;
    			i++;
    		}
    		else {                                               // for last  
    			i++;
    		}
    	}
    	
    }
    
    
    
    
    
    ///////////////////////////////////copied from gfg/////////////////////////////////////////////////////////////////////////

	static int missingK(int[] arr, int k)
	  {
	    int n = arr.length;
	    int l = 0, u = n - 1, mid;   
	    while(l <= u)
	    {
	      mid = (l + u)/2;       
	      int numbers_less_than_mid = arr[mid] -
	        (mid + 1);
	 
	      // If the total missing number
	      // count is equal to k we can iterate
	      // backwards for the first missing number
	      // and that will be the answer.
	      if(numbers_less_than_mid == k)
	      {
	 
	        // To further optimize we check
	        // if the previous element's
	        // missing number count is equal
	        // to k. Eg: arr = [4,5,6,7,8]
	        // If you observe in the example array,
	        // the total count of missing numbers for all
	        // the indices are same, and we are
	        // aiming to narrow down the
	        // search window and achieve O(logn)
	        // time complexity which
	        // otherwise would've been O(n).
	        if(mid > 0 && (arr[mid - 1] - (mid)) == k)
	        {
	          u = mid - 1;
	          continue;
	        }
	 
	        // Else we return arr[mid] - 1.
	        return arr[mid] - 1;
	      }
	 
	      // Here we appropriately
	      // narrow down the search window.
	      if(numbers_less_than_mid < k)
	      {
	        l = mid + 1;
	      }
	      else if(k < numbers_less_than_mid)
	      {
	        u = mid - 1;
	      }
	    }
	 
	    // In case the upper limit is -ve
	    // it means the missing number set
	    // is 1,2,..,k and hence we directly return k.
	    if(u < 0)
	      return k;
	 
	    // Else we find the residual count
	    // of numbers which we'd then add to
	    // arr[u] and get the missing kth number.
	    int less = arr[u] - (u + 1);
	    k = k- less;
	 
	    System.out.println("u :: "+u+"          k :: "+k+"             less :: "+less);
	    // Return arr[u] + k
	    return arr[u] + k;
	  }

}



//public static int findKthPositive(int[] arr, int k) {           //linear navieve approach O(n)      ..own working 0ms
//    
//	int start = 0;
//	int end = arr.length - 1;
//	
//	while(start <= end) {
//		
//		int mid = start + (end - start)/2;   // mid will be 10
//		int no_of_missedElem_till_mid = arr[mid] - (mid+1);     // =5 this will have the no of elem missed till 10  .... ie 10 - (4+1)    .... arr[mid] = 10   mid = 4
//		
//		if(arr[mid])
//		
//		if(k > no_of_missedElem_till_mid) {
//			start = mid +1;
//		}
//		else if(k > arr[mid]) {
//			
//		}
//	}
//   
//	return -1;
//}


/*

List<Integer> list = new ArrayList<Integer>();
int x=0;
int i=1;
int counter =0;

while(i<=100 && x < arr.length) {
	
	boolean notpresent = arr[x] != i;
	
	System.out.println("i :: "+i+"      x :: "+x+"      arr[x] :: "+arr[x]+"     notpresent :: "+notpresent+"     counter :: "+counter);
	
	if(arr[x] != i) {
		list.add(i);
		i++;
		counter ++;
	}
	else if(arr[x] == i) {
		x++;
		i++;
	}
}

System.out.println("list :: "+list);

return -1;

*/







//int start = 0;
//int end = arr.length - 1;
//int c=0;
//
//while(start < end-1) {
//	c++;  if(c==20) break;
//	
//	
//	int mid = start + (end - start)/2;   // mid will be 10
//	int no_of_missedElem_till_mid = arr[mid] - (mid+1);     // =5 this will have the no of elem missed till 10  .... ie 10 - (4+1)    .... arr[mid] = 10   mid = 4
//	
//	System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"          midval :: "+arr[mid]+"      missedvals :: "+no_of_missedElem_till_mid);
//	
//	if(k < arr[mid]) {
//		end = mid;
//	}
//	else if(k > arr[mid]) {
//		start = mid;
//	}
//	
//}
//
//int no_of_missedElem_till_mid_atEnd = arr[end] - (end+1);
//int no_of_missedElem_till_mid_aStart = arr[start] - (start+1);
//
//System.out.println("start :: "+start+"       end :: "+end+"      no_of_missedElem_till_mid_aStart :: "+no_of_missedElem_till_mid_aStart+"    no_of_missedElem_till_mid2 :: "+no_of_missedElem_till_mid_atEnd);   // need to seach between current start and end
//
//return -1;









/*

public static int findKthPositive2(int[] arr, int k) {           //binary approach 
        
    	int start = 0;
    	int end = arr.length - 1;
    	
    	while(start <= end) {
    		
    		int mid = start + (end - start)/2;   // mid will be 10
    		int missedElem_till_mid = arr[mid] - (mid+1);     // =5 this will have the no of elem missed till 10  .... ie 10 - (4+1)    .... arr[mid] = 10   mid = 4
    		
    		System.out.println("start :: "+start+"      mid :: "+mid+"       end :: "+end+"          midval :: "+arr[mid]+"      missedvals :: "+missedElem_till_mid);
    		
    		
    		if(k == missedElem_till_mid) {
    			if(mid > 0 && (arr[mid - 1] - (mid)) == k)   //
    	        {
    	          end = mid - 1;
    	          continue;
    	        }
    			
    			return arr[mid] - 1;
    		}
    		if(k < missedElem_till_mid) {
    			end = mid - 1;
    		}
    		else if(k > missedElem_till_mid) {
    			start = mid + 1;
    		}
    		
    	}
    	
    	if(end < 0)
    		return k;
    	
    	int missed_vals = arr[end] - (end+1);
    	k = k-missed_vals;
    	System.out.println("end :: "+end+"      missed_vals :: "+missed_vals+"        k :: "+k);
    	
    	return arr[end]+k;
    }

*/