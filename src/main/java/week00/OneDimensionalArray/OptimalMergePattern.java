package week00.OneDimensionalArray;

public class OptimalMergePattern {
    public static void bubbleSort(int[] nums,int size){
        for(int i = 0;i < size;i++){
            for(int j = 0;j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void optimalMerge(int[] nums){
        int cost = 0,size = nums.length;
        while (size > 1) {
            int sum = nums[0] + nums[1];
            cost += sum;
            nums[0] = sum;
            for (int i = 1; i < size - 1; i++) {
                nums[i] = nums[i + 1];
            }
            size--;
            bubbleSort(nums, size);
        }
        System.out.println("Total Cost: " + cost);
    }
    public static void main(String[] args) {
        int[] nums1 = {5,10,20};
        int[] nums2 = {30,30};
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
        optimalMerge(nums);
    }
}
