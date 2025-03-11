package week01;

public class MergeSortedArray {
    public static int[] mergeSortedArray(int[] nums1,int[] nums2){
        int[] result = new int[nums1.length+nums2.length];
        int greater = nums2[0];
        for(int i = 0;i < nums1.length; i++){

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,};
        int[] nums2 = {2,5,6};
        System.out.println("array one");
        for(int num : nums1){
            System.out.print(num+" ");
        }
        System.out.println("\narray two");
        for(int num : nums2){
            System.out.print(num+ " ");
        }
        int[] answer = mergeSortedArray(nums1,nums2);
        System.out.println("\nmerge two sorted array");
        for(int num : answer){
            System.out.print(num+" ");
        }
    }
}
