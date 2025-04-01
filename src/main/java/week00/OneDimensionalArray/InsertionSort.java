package week00.OneDimensionalArray;


public class InsertionSort {
    public static void insertionSort(int[] nums){
        int key,temp;
        for(int i = 0;i < nums.length;i++){
            key = nums[i];
            int j = i-1;
            while (j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,3,1,5,2,9,6,10,7,8};
        System.out.println("array before sorting");
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println("\narray after sorting");
        insertionSort(nums);
        for (int num : nums){
            System.out.print(num+" ");
        }
    }
}
