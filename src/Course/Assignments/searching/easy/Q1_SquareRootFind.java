package Course.Assignments.searching.easy;

public class Q1_SquareRootFind {

	public static void main(String[] args) {

		int res = sqrt(9);   //2147395600
		System.out.println("res :: "+res);
	}
	
	
	public static int sqrt(int x) {                               // binary search approach  //need to look into this
		
	    if (x == 0) {
	        return 0;
	    }
	    
	    int start = 1, end = Integer.MAX_VALUE;
	    
	    while (true) {
	        int mid = start + (end - start)/2;
	        System.out.println("start :: "+start+"     mid :: "+mid+"      end :: "+end+"     x/mid :: "+x/mid+"       x/mid+1 :: "+x/mid+1);
	        
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