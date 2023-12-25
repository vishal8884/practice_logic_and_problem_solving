package SdeSheet.basics.recursion.temp;

public class PrintNumbersStraight {
    public static void main(String[] args) {
        print(10,0);
    }

    public static void print(int n,int m){
        if(m == n){
           return;
        }
        System.out.println("m :: "+m);

        print(n,m+1);
    }
}
