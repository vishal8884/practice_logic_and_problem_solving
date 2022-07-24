package Course.Recursion.day2;

public class MoveAllXToEndOfTheString {

	public static void main(String[] args) {

		String str = "axbcxxd";
		String finalRes = moveAllXtoEnd(str, 0,"",0);
		
		System.out.println("finalRes :: "+finalRes);
	}
	
	public static String moveAllXtoEnd(String str,int index,String res,int c) {
		
		if(index==str.length()) {
			if(c!=0) {
				String xvals = "x".repeat(c);
				return res+xvals;
			}
			else {
				return res;
			}
			
		}
		
		char curr = str.charAt(index);
		if(curr!='x') {
			res = res + curr;
			c=c+1;
		}
		String res1 = moveAllXtoEnd(str, index+1, res,c);
		return res1;
	}
	
	public static void moveAllXtoEndNoRecursion(String str) {
		String res = "";
		int c=0;
		
		for(int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			if(curr!='x') {
				res=res+curr;
			}
			else {
				c++;
			}
		}
		
		String r = "x".repeat(c);
		
		System.out.println("res :: "+res+r);
	}

}
