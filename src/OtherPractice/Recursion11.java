package OtherPractice;

public class Recursion11 {
    public static void main(String[] args) {
        printNumbers(10);
    }


    public static void printNumbers(int n){
        if(n == 0)
            return;
        System.out.println(n);

        printNumbers(n-1);
    }
}
