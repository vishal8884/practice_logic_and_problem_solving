package Course.Assignments.searching.easy.playaround;

public class Q1_squareRoot_temp {

	public static void main(String[] args) {

	}

	public static int sqrtCopiedFromLeetCode(int x) { // binary search approach //need to look into this

		if (x == 0) {
			return 0;
		}

		int start = 1, end = Integer.MAX_VALUE;

		while (true) {
			int mid = start + (end - start) / 2;
			System.out.println("start :: " + start + "     mid :: " + mid + "      end :: " + end + "     x/mid :: "
					+ x / mid + "       x/mid+1 :: " + x / (mid + 1));

			if (mid > x / mid) {
				end = mid - 1;
			} else {
				if (mid + 1 > x / (mid + 1)) {
					return mid;
				}
				start = mid + 1;
			}
		}
	}

}
