package Course.Recursion.day2;

public class SubSequenceOfString {

	public static void main(String[] args) {

		String str = "abc";
		getSubSequence(str,0,"");
	}
	
	public static void getSubSequence(String str,int index, String res) {
		
		if(index == str.length()) {
			System.out.println("res :: "+res);
			return;
		}
		
		char curr = str.charAt(index);
		
		getSubSequence(str, index+1, res+curr);
		
		getSubSequence(str, index+1, res);
	}

}
