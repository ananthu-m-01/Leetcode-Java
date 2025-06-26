package week00.OneDimensionalArray;

public class MinimumFromSortedRotatedArrayBruteForce {
    public static int minimum(int[] nums){
        int min = nums[0];
        for(int num : nums){
            min = Math.min(min,num);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {5,6,1,2,3,4};
        System.out.print("minimum element : "+minimum(nums));
    }
}
