package week01;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0, min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int answer = maxProfit(prices);
        System.out.println("answer : "+answer);
    }
}
