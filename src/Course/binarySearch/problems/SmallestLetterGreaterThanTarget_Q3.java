package Course.binarySearch.problems;

import java.util.Arrays;

public class SmallestLetterGreaterThanTarget_Q3 {

	// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

	public static void main(String[] args) {

		char[] letters = {'e','e','e','k','q','q','q','v','v','y'};
		//char[] letters = {'c','f','j'};
		char res = nextGreatestLetter(letters, 'v');
		
		System.out.println("res :: "+res);

	}

	public static char nextGreatestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length-1;
		
		
		while(start<=end) {
			int mid = start + (end -start)/2;
			System.out.println("start :: "+start+"     end :: "+end+"      mid :: "+mid+"     mid val :: "+letters[mid]);
			
			if(target < letters[mid]) {
				end = mid - 1;
			}
			else {  
				start = mid + 1;   //target >= letters[mid]
			}

		}
		System.out.println("start % letters.length :: "+start % letters.length);
		return letters[start % letters.length];
	}
	
//	static int removeDuplicates(char arr[], int n)
//    {
//        if (n == 0 || n == 1)
//            return n;
//      
//        // To store index of next unique element
//        int j = 0;
//      
//        // Doing same as done in Method 1
//        // Just maintaining another updated index i.e. j
//        for (int i = 0; i < n-1; i++)
//            if (arr[i] != arr[i+1]) {
//                arr[j] = arr[i];
//                j++;
//            }
//      
//        arr[j++] = arr[n-1];
//      
//        return j;
//    }
}
