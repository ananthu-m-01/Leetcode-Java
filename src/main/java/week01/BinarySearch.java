package week01;

public class BinarySearch {
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int mid;
        while (start<=end){
            mid = (start+end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans = binarySearch(nums,target);
        System.out.println("answer : "+ans);
    }
}
