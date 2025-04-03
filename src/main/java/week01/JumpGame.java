package week01;

public class JumpGame {
    public static boolean jumpGame(int[] nums){
       int target = nums.length-1;
       for(int i = nums.length-1;i >= 0;i--){
           if(nums[i]+i >= target){
               target = i;
           }
       }
       return target == 0;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean ans = jumpGame(nums);
        System.out.println("answer : "+ans);
    }
}
