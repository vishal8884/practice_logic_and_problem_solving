package SdeSheet.basics.recursion.temp;

import java.util.Arrays;

public class PrintNumbers {

    public static void main(String[] args) {

        int[] res = printNos(5);  // 1,2,3,4,5
        System.out.println("res :: "+ Arrays.toString(res));
    }

    public static int[] printNos(int x) {
        int[] res = new int[x];
        addElem(res,x);

        return res;
    }

    private static void addElem(int[] arr,int x){
        if(x == 0){
            return;
        }

        arr[x-1] = x;
        addElem(arr,x-1);
    }
}
