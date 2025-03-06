package week00;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,4,6,5,9,7,8,10};
        System.out.println("array before sorting!");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        bubbleSort(nums);
        System.out.println("\narray after sorting!");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
