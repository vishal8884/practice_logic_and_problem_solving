package Course.Assignments.searching.playAround;

public class FindNearestNumber {

	public static void main(String[] args) {

		int[] arr = {1,28,21};
		int res = findNearestNumber(arr, 26);
		
		System.out.println("res :: "+res);
	}
	
	public static int findNearestNumber(int[] arr,int num) {
	
		int nearest_diff_elem_num = Integer.MAX_VALUE;
		int nearestNum = Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==num) {
				return arr[i];
			}
			if(Math.abs(arr[i]-num) < nearest_diff_elem_num) {
				nearestNum = arr[i];
				nearest_diff_elem_num = Math.abs(arr[i]-num);
			}
			
			//System.out.println("arr[i] :: "+arr[i]+"    num :: "+num+"      nearest_diff_elem_num :: "+nearest_diff_elem_num+"    nearestNum :: "+nearestNum+"      Math.abs(arr[i]-num) :: "+Math.abs(arr[i]-num));
		}
		
		
		return nearestNum;
	}

}
