package week01;

public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] nums){
        int i = 0;
        while(i <= nums.length-3){
            if(nums[i]%2 == 1 && nums[i+1]%2==1 && nums[i+2]%2 == 1){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,34,3,4,5,7,23,12};
        boolean answer = threeConsecutiveOdds(nums);
        System.out.println("answer : "+answer);
    }
}
