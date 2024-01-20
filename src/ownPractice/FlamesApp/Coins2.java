package ownPractice.FlamesApp;

public class Coins2 {
    public static void main(String[] args) {
        int res = change(8, new int[]{1, 2, 5});
        //int res2 = change(0, new int[]{7});
        System.out.println("res :: "+res);
    }

    public static int change(int amount, int[] coins) {
        int counter = 0;

        if(amount == 0)
            return counter;

        for(int i=0;i<coins.length;i++){
            int currElem = coins[i];
            for(int j=0;j<coins.length;j++){
                if(currElem == amount){
                    counter++;
                    System.out.println("coins[i] :: "+coins[i]+"    currElem :: "+currElem+"    coins[j] :: "+coins[j]+"   counter :: "+counter+"    break");
                    break;
                }
                if(i != j && (currElem + coins[j] == amount)){
                    counter ++;
                    System.out.println("coins[i] :: "+coins[i]+"    currElem :: "+currElem+"    coins[j] :: "+coins[j]+"   counter :: "+counter);
                }

                if(currElem < amount && j == coins.length - 1){  //till last we did not find any
                    currElem = currElem + coins[i];
                    j=-1;
                    if(currElem > amount)
                        break;
                }
            }
            System.out.println();
        }


        return counter;
    }
}
