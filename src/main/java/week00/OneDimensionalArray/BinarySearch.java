package week00.OneDimensionalArray;

public class BinarySearch {
    public static void binarySearch(int[]nums ,int target){
        boolean found = false;
        int start = 0,end = nums.length-1,mid;
        while (start<=end){
            mid = (start+end)/2;
            if(nums[mid]>target){
                end  = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                found  = true;
                System.out.println("target element found at index: "+mid);
                break;
            }
        }
        if(!found){
            System.out.println("target element not found");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        System.out.println("array elements are !");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\ntarget element is :"+target);
        binarySearch(nums,target);
    }
}
