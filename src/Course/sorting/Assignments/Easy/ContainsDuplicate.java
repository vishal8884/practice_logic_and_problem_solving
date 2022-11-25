package Course.sorting.Assignments.Easy;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,5,8,1,4};
        boolean res = containsDuplicate(arr);
        System.out.println("res :: "+res);
	}

	public static boolean containsDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println("i :: "+i+"    j :: "+j);
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
