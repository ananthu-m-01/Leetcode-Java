package week03;

public class StackLinearSearch {
    public static int stackLinearSearch(int[] nums,int n,int target){
        if(n < 0){
            return -1;
        }
        if(nums[n] == target){
            return n;
        }else{
            return stackLinearSearch(nums,n-1,target);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        int target = 7;
        int ans = stackLinearSearch(nums,nums.length-1,target);
        if(ans != -1){
            System.out.println("element found at : "+ans);
        }else{
            System.out.println("element not found!");
        }
        System.out.println("time taken for searching : "+(ans+1));
    }
}
