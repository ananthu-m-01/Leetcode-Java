package week00.OneDimensionalArray;

public class OptimalMergePattern {
    public static void bubbleSort(int[] nums,int size){
        for(int i = 0;i < size;i++){
            for(int j = 0;j<size-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int num : nums){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    public static void optimalMerge(int[] nums){
        int cost = 0,value = 0;
        for(int i = 0;i<nums.length;i++){
            value = nums[0]+nums[1];
            cost += value;
            nums[0] = value;
            nums[1] = 0;
            int temp = nums[1];
            nums[1] = nums[nums.length-i-1];
            nums[nums.length-i-1] = nums[1];
            bubbleSort(nums,nums.length-i-1);
            if(nums[0] == 0){
                break;
            }
        }
        System.out.println("cost :"+cost);
    }
    public static void main(String[] args) {
        int[] nums1 = {3,5,5,6,34};
        int[] nums2 = {5,6,7,7,45};
        int size = nums1.length+nums2.length,count = 0;
        int[] nums = new int[size];
        for(int i = 0;i < nums1.length;i++){
            nums[i] = nums1[i];
            count++;
        }
        for(int i = 0;i < nums2.length;i++){
            nums[count] = nums2[i];
            count++;
        }
        System.out.println("array elements");
        for(int num : nums){
            System.out.print(num+ " ");
        }
        bubbleSort(nums,nums.length);
        System.out.println("\narray elements after sorting");
        for(int num : nums){
            System.out.print(num+ " ");
        }
        optimalMerge(nums);
    }
}
