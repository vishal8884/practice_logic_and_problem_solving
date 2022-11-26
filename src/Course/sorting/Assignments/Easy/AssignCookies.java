package Course.sorting.Assignments.Easy;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {

		int[] g = {1,2};
		int[] s = {1,2,3};
		int res = findContentChildren(g, s);
		System.out.println("res :: "+res);
	}

	public static int findContentChildren(int[] g, int[] s) {
		//we can use sliding window technique
		Arrays.sort(g);
		Arrays.sort(s);
		
		System.out.println("g :: "+Arrays.toString(g));
		System.out.println("s :: "+Arrays.toString(s));
		
		int res = 0;
		int i=0;
		int j=0;
		
		while(i<g.length && j<s.length) {
			if(g[i] <= s[j]) {
				i++;
				j++;
				res++;
			}
			else {
				j++;
			}

		}
		
		return res;
	}

}
