package week01;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int actualSum = ((nums.length)*(nums.length+1)/2);
        boolean present = false;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i] == 0){
                present = true;
            }
        }
        if(!present){
            return 0;
        }else{
            int missingNumber = actualSum-sum;
            if(missingNumber!=0){
                return missingNumber;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums= {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(nums);
        System.out.println("answer : "+ans);
    }
}
