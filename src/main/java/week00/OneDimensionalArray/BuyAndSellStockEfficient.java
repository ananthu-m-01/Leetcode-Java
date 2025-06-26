package week00.OneDimensionalArray;

public class BuyAndSellStockEfficient {
    public static int findProfit(int[] prices){
        int maxProfit = 0,temp = 0,min = 0;
        for(int i = 0;i < prices.length-1; i++){
            temp = prices[i+1] - prices[min];
            maxProfit = Math.max(maxProfit,temp);
            min = Math.min(min,prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {1,7,6,4,3,1};
        System.out.println("maximum profit : "+findProfit(prices));
    }
}
