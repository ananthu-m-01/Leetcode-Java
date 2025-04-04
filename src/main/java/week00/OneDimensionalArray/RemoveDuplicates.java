package week00.OneDimensionalArray;

public class RemoveDuplicates {
    public static void bubbleSort(int[] nums){
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static int removeDuplicates(int[] nums,int[] ans){
        int size = 0;
        ans[size++] = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                ans[size++] = nums[i];
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,7,2,3,1,5,6,7,4,3,5};
        int[] ans = new int[nums.length];
        bubbleSort(nums);
        int size = removeDuplicates(nums,ans);
        System.out.println("answer");
        for(int i = 0;i<size;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
