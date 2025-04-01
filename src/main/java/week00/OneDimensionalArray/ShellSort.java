package week00.OneDimensionalArray;

public class ShellSort {
    public static void shellSort(int[] nums){
        for(int gap = nums.length/2;gap>=1;gap/=2){
            for(int j = gap;j<nums.length;j++){
                for(int i = j-gap;i>=0;i-=gap){
                    if(nums[i+gap] > nums[i]){
                        break;
                    }else{
                        int temp = nums[i+gap];
                        nums[i+gap] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,5,8,4,6,10,9};
        System.out.println("array before sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }
        shellSort(nums);
        System.out.println("\narray after sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
