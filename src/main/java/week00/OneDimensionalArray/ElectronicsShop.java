package week00.OneDimensionalArray;

import java.util.Arrays;

public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards,int[] drives, int budget){
        Arrays.sort(drives);
        int cost = 0, tempCost = 0;
        for(int i = 0;i<keyboards.length;i++){
            for(int j = 0; j < drives.length;j++){
                tempCost = keyboards[i]+drives[j];
                if(cost < tempCost && tempCost <= budget){
                    cost = tempCost;
                }
            }
        }
        if(cost != 0){
            return cost;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] keyboards  = {3,1};
        int[] drives = {5,2,8};
        int budget = 10;
        int moneySpent = getMoneySpent(keyboards,drives,budget);
        System.out.println("total money spent : "+moneySpent);
    }
}
