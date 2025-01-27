package week01;

public class RemoveElementFromSortedArray {
    public static int removeElementFromSortedArray(int[] nums){
        int size = 0;
        nums[size] = nums[0];
        size++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!= nums[i-1]){
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeElementFromSortedArray(nums);
        System.out.println("answer :"+ans);
    }
}
