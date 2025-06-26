package week00.OneDimensionalArray;

public class MaximumSubArrayBruteForce {
    public static int maximumSubArraySum(int[] nums){
        int sum = nums[0], maxSum = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            sum = nums[i];
            for(int j = i+1; j < nums.length;j++){
                sum+=nums[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4,10};
        System.out.println("maximum sum : "+maximumSubArraySum(nums));
    }
}
