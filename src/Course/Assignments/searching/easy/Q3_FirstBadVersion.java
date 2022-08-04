package Course.Assignments.searching.easy;

public class Q3_FirstBadVersion {

	public static void main(String[] args) {

		int res = firstBadVersion(2);
		System.out.println("res :: "+res);
	}

	public static int firstBadVersion(int n) {

		for (int i = n-1; i >=0; i--) {
			if (isBadVersion(i))
				return i;
		}

		return 1;
	}
	
	
	public static boolean isBadVersion(int version) {
		
		if(version == 2)
			return true;
		if(version == 2)
			return true;
		
		return false;
	}

}
