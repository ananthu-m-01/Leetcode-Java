package week00.OneDimensionalArray;

public class MaximumSubArrayEfficient {
    public static int maximumSubArraySum(int[] nums){
        int sum = nums[0], maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,-1,-1,-1};
        System.out.println("maximum sum : "+maximumSubArraySum(nums));
    }
}
