package Course.Recursion.day2;

public class PrintOldMobileCombination {

	public static void main(String[] args) {

		String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		printCombination("23",0,"",arr);
	}
	
	
	public static void printCombination(String n,int index,String combination,String[] arr) {
		
		if(index >= n.length()) {
			System.out.println("combination :: "+combination);
			return;
		}
		
		char curr = n.charAt(index);
		String alphabets = arr[curr - '0'];
		
		for(int i=0;i<alphabets.length();i++) {
			printCombination(n, index+1, combination+alphabets.charAt(i), arr);
		}
		
	}

}












//public static void printCombination(String n,int index,String combination,String[] arr) {
//	
//	if(index >= n.length()) {
//		System.out.println("combination :: "+combination);
//		return;
//	}
//	
//	char currentChar = n.charAt(index);
//	String digits = arr[currentChar - '0'];
//	
//	for(int i=0;i<digits.length();i++) {
//		printCombination(n, index+1, combination+digits.charAt(i), arr);
//	}
//}