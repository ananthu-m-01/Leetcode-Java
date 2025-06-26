package week00.OneDimensionalArray;

public class FindtheDuplicateNumberBruteForce {
    public static int duplicateNumber(int[] nums){
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,1};
        System.out.println("duplicate number is : "+duplicateNumber(nums));
    }
}
