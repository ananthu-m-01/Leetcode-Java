package week00.OneDimensionalArray;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1,int[] nums2){
        int[] nums = new int[nums1.length+nums2.length];
        int left = 0,right = 0,i=0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                nums[i] = nums1[left];
                left++;
            }else{
                nums[i] = nums2[right];
                right++;
            }
            i++;
        }
        while (left < nums1.length){
            nums[i] = nums1[left];
            i++;
            left++;
        }
        while (right < nums2.length){
            nums[i] = nums2[right];
            i++;
            right++;
        }
        System.out.println("array elements are");
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {2,4,6,8,10};
        mergeSortedArray(nums1,nums2);
    }
}
