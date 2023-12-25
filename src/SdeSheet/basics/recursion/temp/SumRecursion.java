package SdeSheet.basics.recursion.temp;

public class SumRecursion {
    public static void main(String[] args) {
        int res = addSumStraight(12, 0);
        System.out.println("res :: "+res);
    }


    private static int addSumStraight(int n,int sum){
        if(n == 0)
            return sum;

        sum = sum + n;

        return addSumStraight(n-1,sum);
    }


    private static int addSum(int n,int sum){
        if(n == 0)
            return sum;

        sum = sum + n;

        return addSum(n-1,sum);
    }
}
