package Course.linearSerch;

public class MaxWealth {

	public static void main(String[] args) {

		int[][] accounts = {{1,2,3},{3,2,1}};
		maximumWealth(accounts);
	}

	public static int maximumWealth(int[][] accounts) {

		int sum =0,max = Integer.MIN_VALUE;
		
		
		for(int i=0;i<accounts.length;i++) {
			sum=0;
			for(int j=0;j<accounts[i].length;j++) {
				sum = sum + accounts[i][j];
				if(sum>max)
					max = sum;
			}
		}
		
		return max;
	}

}
