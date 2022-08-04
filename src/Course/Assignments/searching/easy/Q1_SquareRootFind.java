package Course.Assignments.searching.easy;

public class Q1_SquareRootFind {

	public static void main(String[] args) {

		int res = sqrt(20);   //2147395600
		System.out.println("res :: "+res);
	}
	
	//own binary search
	public static int sqrt(int x) {                               // binary search approach own  ...working
		
	    if (x == 0) {
	        return 0;
	    }
	    
	    //this can be potential answers  from 1 to max val
	    //1,2,3,4,5,6,7,8,9,10         ....maxval   for eg assue till 10
	    long start = 1, end = Integer.MAX_VALUE;
	    
	    while (start <= end) {
	        long mid = start + (end - start)/2;          
	        System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end);
	        
	        if(mid * mid > x) {           // first mid is 5 ...5*5=25 is greater than x= 20 so ans should be less than 5 ....so eliminate right side of mid
	        	end = mid -1;
	        }
	        else if(mid * mid < x) {     // for eg 2*2=4 is less than x= 20  so eliminate left side of mid
	        	start = mid +1;
	        }
	        else {
	        	return (int)mid;         // if correct anser found  for eg 4*4 = 16 then return mid
	        }
	    }
	    
	    
	    return (int)start-1;            // mid * mid != target ... eg 20 has no squre root ....send the last value that matched the case 
	                                    // ie start :: 5     mid :: 5      end :: 5 all three are same  ..it points to next possible answer .. so sub 1 from it and return
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////

	//own linear search
	public static int mySqrt(int x) {                   //using linear search own logic   .. pattern sq(1) = 1, sq(4) = 2, sq(9) = 3, sq(16) =4
                                                        // here sq(var) var is increasing by 3 in each...used that approach
		int increase_vals = 1;
		long i = 0;
		int counter = 0;
		int prev_counter = -1;
		
		while(i < x) {
			prev_counter = counter;
			
			System.out.println("i :: "+i+"     increase_vals :: "+increase_vals+"     counter :: "+counter);
			
			i = i+increase_vals;
			increase_vals = increase_vals +2;
			counter++;
		}
		
		if(i==x) {
			return prev_counter+1;
		}
			
		
		return prev_counter;
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	//leetcode best anser binary search
	public static int sqrtCopiedFromLeetCode(int x) {                               // binary search approach  //need to look into this
		
	    if (x == 0) {
	        return 0;
	    }
	    
	    int start = 1, end = Integer.MAX_VALUE;
	    
	    while (true) {
	        int mid = start + (end - start)/2;
	        System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"     x/mid :: "+x/mid+"       x/mid+1 :: "+x/(mid+1));
	        
	        if (mid > x/mid) {
	            end = mid - 1;
	        } 
	        else {
	            if (mid + 1 > x/(mid + 1)) {
	                return mid;
	            }
	            start = mid + 1;
	        }
	    }
	}

}





/*
int increase_vals = 1;
int i = 0;
int counter = 0;
int prev_counter = -1;

while(i < x) {
	prev_counter = counter;
	
	System.out.println("i :: "+i+"     increase_vals :: "+increase_vals+"     counter :: "+counter);
	
	i = i+increase_vals;
	increase_vals = increase_vals +2;
	counter++;
}

if(i==x) {
	return prev_counter+1;
}
	

return prev_counter;*/

/////////////////////////////////////



/*
int increase_vals = 1;
int i = 0;

for(i=1;i<=x;i=i+increase_vals) {
	System.out.println("i :: "+i+"     increase_vals :: "+increase_vals);
	
	increase_vals= increase_vals + 2;
}

return i;
*/