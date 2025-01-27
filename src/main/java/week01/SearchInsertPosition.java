package week01;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        if(target<nums[0] || target == nums[start]){
            return 0;
        }else if(target>=nums[end]) {
            return end;
        }else{
            while(start<end) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = (start + end) / 2;
            }
            if(target>nums[mid]){
                return mid+1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int ans = searchInsertPosition(nums,target);
        System.out.println("answer : "+ans);
    }
}
