package week00.OneDimensionalArray;

public class MinimumFromSortedRotatedArrayEfficient {
    public static int minimum(int[] nums){
        int min = nums[0], start = 0, end = nums.length-1, mid = 0;
        while(start <= end){
            mid = (start + end) / 2;
            min = Math.min(nums[mid],min);
            if(nums[end] < nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return Math.min(min,nums[mid]);
    }
    public static void main(String[] args) {
        int[] nums = {5,6,0,1,2,3,4};
        System.out.print("minimum element : "+minimum(nums));
    }
}
