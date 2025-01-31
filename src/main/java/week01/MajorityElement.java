package week01;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        int count = 0,majorityNumber = nums[0];
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                majorityNumber = nums[i];
                count = 1;
            }else if(nums[i] == majorityNumber){
                count++;
            }else{
                count--;
            }
        }
        return majorityNumber;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println("answer : "+ans);
    }
}
