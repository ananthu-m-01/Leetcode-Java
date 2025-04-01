package week00.OneDimensionalArray;

public class SelectionSort {
    public static void selectionSort(int[] nums){
        int min,temp;
        for (int i = 0;i < nums.length; i++){
            min = i;
            for (int j = i+1;j < nums.length;j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4,1,7,5,8,9,6,10};
        System.out.println("array before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\narray after sorting");
        selectionSort(nums);
        for (int num : nums){
            System.out.print(num+" ");
        }
    }
}
