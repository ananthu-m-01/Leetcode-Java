package week00;

public class LargestAndSmallestElement {
    public static void largestAndSmallest(int[] nums){
        int largest = nums[nums.length-1], smallest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }else if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println("\nlargest element : "+largest);
        System.out.println("smallest element : "+smallest);
    }
    public static void main(String[] args) {
        int[] nums = {4,2,3,1,7,8,10,5,9,6};
        System.out.println("array elements are : ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        largestAndSmallest(nums);
    }
}
