package Course.Recursion.day2;

public class RemoveDuplicatesInString {
	
	public static boolean[] track = new boolean[26];

	public static void main(String[] args) {

		String str = "abbccdadsfdfgcvdf";
		String res = removeDuplicatesInString(str,0,"");
		System.out.println("res using own       :: "+res);
		
		String resUsingArray = removeDuplicatesInStringUsingBooleanArray(str,0,"");
		System.out.println("resUsingBoleanArray :: "+resUsingArray);
	}
	
	
    public static String removeDuplicatesInStringUsingBooleanArray(String str,int index,String res) {
		
		if(index == str.length()) {
			return res;
		}
		
		char curr = str.charAt(index);
		if(track[curr-'a']) {
			return removeDuplicatesInStringUsingBooleanArray(str, index+1, res);
		}
		else {
			res = res + curr;
			track[curr-'a'] = true;                                                //this marks as already seen
			return removeDuplicatesInStringUsingBooleanArray(str, index+1, res);
		}
		
	}
	
	
	public static String removeDuplicatesInString(String str,int index,String res) {
		
		if(index == str.length()) {
			return res;
		}
		
		String curr = String.valueOf(str.charAt(index));
		if(!res.contains(curr)) {
			res = res + curr;
		}
		
		String removeDuplicatesInString = removeDuplicatesInString(str, index+1, res);
		return removeDuplicatesInString;
	}
	
	
	
	public static void removeDuplicatesInStringNonRecirsion(String str) {
		
		String res = "";
		
		for(int i=0;i<str.length();i++) {
			String curr = String.valueOf(str.charAt(i));
			if(!res.contains(curr)) {
				res = res+curr;
			}
		}
		
		System.out.println("res :: "+res);
	}

}
