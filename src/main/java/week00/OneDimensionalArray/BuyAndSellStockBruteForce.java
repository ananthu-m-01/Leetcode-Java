package week00.OneDimensionalArray;

public class BuyAndSellStockBruteForce {
    public static int findProfit(int[] prices){
        int maxProfit = 0;
        for(int i = 0;i < prices.length; i++){
            for(int j = i+1; j < prices.length;j++){
                maxProfit = Math.max(maxProfit,(prices[j]-prices[i]));
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {1,7,6,4,3,1};
        System.out.println("maximum profit : "+findProfit(prices));
    }
}
