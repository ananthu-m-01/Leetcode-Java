package week00.OneDimensionalArray;

public class MaximumElement {
    public static void maximumElement(int[] nums){
        int max = nums[0];
        for(int i = 1; i< nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("maximum element : "+max);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,57,6,8,9,};
        maximumElement(nums);
    }
}
