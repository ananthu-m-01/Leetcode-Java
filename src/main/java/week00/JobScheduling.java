package week00;

public class JobScheduling {
    public static void bubbleSort(int[] jobs,int[] deadLine,int[] profit){
        for(int i = 0;i < profit.length;i++){
            for(int j = 0; j< profit.length-1;j++){
                if(profit[j+1] > profit[j]){
                    int temp = jobs[j];
                    jobs[j] = jobs[j+1];
                    jobs[j+1] = temp;
                    temp = deadLine[j];
                    deadLine[j] = deadLine[j+1];
                    deadLine[j+1] = temp;
                    temp = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] job = {1,2,3,4,5};
        int[] deadLine = {2,2,1,3,4};
        int[] profit = {10,50,30,110,90};
        int size = job.length;
        bubbleSort(job,deadLine,profit);
        System.out.println("\nafter sorting with respect to profit");
        System.out.println("Job");
        for(int jobData : job){
            System.out.print(jobData+" ");
        }
        System.out.println("\nDeadline");
        for(int deadlineData : deadLine){
            System.out.print(deadlineData+" ");
        }
        System.out.println("\nProfit");
        for(int profitData : profit){
            System.out.print(profitData+" ");
        }
        int max = deadLine[0];
        for(int i = 0; i< job.length;i++){
            if(deadLine[i] > max){
                max = deadLine[i];
            }
        }
        int[] slot = new int[max+1];
        int[] result = new int[max+1];
        System.out.println("\nmaximum deadline : "+max);
        int totalProfit = 0;
        for(int i = 0;i < job.length;i++){
            for(int j = deadLine[i];j > 0;j--){
                if (slot[j] == 0){
                    slot[j] = 1;
                    result[j] = job[i];
                    totalProfit += profit[i];
                    break;
                }
            }
        }
        System.out.println("\nAllocated slots");
        for(int slots :slot){
            System.out.print(slots+" ");
        }
        System.out.println("\nResult Array");
        for(int results : result){
            System.out.print(results+" ");
        }
        System.out.println("\nTotal Profit : "+totalProfit);
    }
}