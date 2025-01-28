package week01;

public class PlusOne {
    public static int[] plusOne(int[] nums){
       for(int i =nums.length-1;i>=0;i--){
           if(nums[i] < 9) {
               nums[i] += 1;
               return nums;
           }
           nums[i] = 0;
       }
       int[] ans = new int[nums.length+1];
       ans[0] = 1;
       return ans;
    }
    public static void main(String[] args) {
        int[] nums = {8,9};
        int[] ans = plusOne(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}
