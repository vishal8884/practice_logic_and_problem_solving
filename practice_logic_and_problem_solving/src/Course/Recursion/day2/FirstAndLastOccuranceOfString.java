package Course.Recursion.day2;

public class FirstAndLastOccuranceOfString {

	static int start=-1;
	static int end = -1;
	
	public static void main(String[] args) {

		String str="babaacdaefaah";
		
//		findFirst(str,'a',0);     //len =12
//		findLast(str,'a',str.length()-1);
		
		findOccurance(str,0,'a');
		
	}
	
	
	public static void findOccurance(String str, int index, char elem) {
		
		if(index==str.length()) {
			System.out.println("first :: "+start);
			System.out.println("last ::  "+end);
			return;
		}
		
		char curr = str.charAt(index);
		if(curr == elem) {
			if(start == -1) {
				start = index;
			}
			else {
				end = index;
			}
		}
		
		findOccurance(str, index+1, elem);
	}
	
	
	
	public static void findFirst(String str,char c,int index) {
		if(index == str.length()-1) {
			return;
		}
		char curr = str.charAt(index);
		if(curr == c) {
			start = index;
		}
		findFirst(str, c, index+1);
	}
	
	public static void findLast(String str,char c,int index) {
		if(index < 0) {
			return;
		}
		char curr = str.charAt(index);
		if(curr == c) {
			end = index;
		}
		findLast(str, c, index-1);
	}
	
	public static void findUsingNormal(String str,char c) {
		int start=-1;
		int end = -1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				start=i;
				break;
			}
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i) == c) {
				end=i;
				break;
			}
		}
		
		System.out.println("end :: "+end);
		System.out.println("start :: "+start);
		
	}

}
