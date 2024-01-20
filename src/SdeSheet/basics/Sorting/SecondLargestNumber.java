package SdeSheet.basics.Sorting;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] res = getSecondOrderElements(4, new int[]{3, 4, 5, 2});
        System.out.println("res :: "+ Arrays.toString(res));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        //3,5,1,2,8,4
        //3,4,5,2
        int min,minPos,max,maxPos;
        int[] res = new int[2];

        for(int i=0;i<n;i++){
            min = Integer.MAX_VALUE;
            minPos = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(a[j] < min){
                    min = a[j];
                    minPos = j;
                }
            }


            if(i == 1){
                res[1] = min;
                break;
            }

            swap(i, minPos, a);
        }

        for(int i=n-1; i>=0;i--){
            max = Integer.MIN_VALUE;
            maxPos = Integer.MIN_VALUE;
            for(int j=i ; j >=0 ;j--){
                if(a[j] > max){
                    max = a[j];
                    maxPos = j;
                }
            }

            if(i == n-2){
                res[0] = max;
                break;
            }

            swap(i, maxPos, a);
        }

        return res;
    }

    private static void swap(int a,int b,int[] arr){
        if(a == b)
            return;

        int temp = arr[a];
        arr[a] = arr[b];
        arr[a] = temp;
    }
}
