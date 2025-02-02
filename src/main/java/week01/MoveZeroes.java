package week01;

public class MoveZeroes {
    public static int[] movieZeroes(int[] nums){
        int size = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[size] = nums[i];
                size++;
            }
        }
        for(int i=size;i<nums.length;i++){
            nums[size] = 0;
            size++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] updatedNums = movieZeroes(nums);
        System.out.println("updated array");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
