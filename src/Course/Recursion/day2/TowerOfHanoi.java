package Course.Recursion.day2;

public class TowerOfHanoi {

	
	public static void main(String[] args) {

		towerOfHanoiMove(2,"S","H","D");
	}
	
	public static void towerOfHanoiMove(int n, String src, String helper, String destination) {
		if(n==1) {
			System.out.println("transfer disk "+n+" from source "+src+" to destination :: "+destination);
			return;
		}
		
		towerOfHanoiMove(n-1, src, destination, helper);
		System.out.println("transfer disk "+n+" from source "+src+" to destination :: "+destination);
		towerOfHanoiMove(n-1, helper, src, destination);
		
	}

}
