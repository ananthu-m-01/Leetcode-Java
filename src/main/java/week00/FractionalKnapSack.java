package week00;

public class FractionalKnapSack {
    public static void bubbleSort(double[] ratio,int[] weight,int[] profit){
        for(int i = 0;i < ratio.length;i++){
            for(int j = 0;j < ratio.length-1;j++){
                if(ratio[j+1] > ratio[j]){
                    double tempRatio = ratio[j];
                    ratio[j] = ratio[j+1];
                    ratio[j+1]= tempRatio;
                    int tempWeight = weight[j];
                    weight[j] = weight[j+1];
                    weight[j+1] = tempWeight;
                    int tempProfit = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = tempProfit;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] weight = {5,6,4,2,8,3};
        int[] profit = {10,14,10,6,15,11};
        int maxWeight = 19;
        double[] ratio = new double[weight.length];

        for(int i = 0;i < weight.length;i++){
            ratio[i] = (double) (profit[i]/weight[i]);
        }

        bubbleSort(ratio,weight,profit);
        double totalProfit = 0.0;
        for(int i = 0;i < weight.length;i++){
            if(weight[i] <= maxWeight){
                totalProfit += profit[i];
                maxWeight -= weight[i];
            }else{
                double fraction = (double) maxWeight/weight[i];
                totalProfit += profit[i]*fraction;
                maxWeight = 0;
            }
        }
        System.out.println("Maximum profit: " + totalProfit);
    }
}
