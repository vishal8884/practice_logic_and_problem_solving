package Course.Assignments.searching.medium;

public class Q8_ReachANumber {

	public static void main(String[] args) {

		int res = reachNumber(5);
		System.out.println("res :: "+res);
	}

	//0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
	
	public static int reachNumber(int target) {

		target = Math.abs(target);
		
		int pos=0;
		int i = -1;
		
			for(i=1;i<=Integer.MAX_VALUE;i++) {
				pos = pos + i;
				if(pos == target) {
					return i;
				}
				System.out.println("moves :: "+i+"     pos :: "+pos);
				
				if(pos > target && (pos - target)%2 == 0) {  //dont break the loop till we find even diff between pos and target
					break;
				}
			}
			return i;
		
		
	}

}
