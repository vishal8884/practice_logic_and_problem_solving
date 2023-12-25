package SdeSheet.basics.recursion.temp;

public class SumRecursion2 {
    public static void main(String[] args) {
        long res = sumFirstN(999999999);
        System.out.println("res :: "+res);
    }

    public static long sumFirstN(long n) {
        long sum = 0;
        long res = getSum(sum, n);

        return res;
    }

    private static long getSum(long sum,long n){
        if(n == 0){
            return sum;
        }
        System.out.println("n :: "+n+"    sum :: "+sum);

        sum = sum + n;

        return getSum(sum, n-1);
    }
}
