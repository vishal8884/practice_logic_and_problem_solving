package Course.Recursion.day2;

public class PrintSringInReverse {

	public static void main(String[] args) {

		String s = "abcd";

		String res = rev(s,s.length()-1,"");
		System.out.println("res outside :: "+res);
	}

	public static String rev(String s,int i,String res) {
          if(i<0) {
        	  return res;
          }
          res=res+s.charAt(i);
          return rev(s,i-1,res);
		
	}

	public static void revNormal(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		System.out.println("res :: " + res);
	}

}
