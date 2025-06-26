package week00.OneDimensionalArray;

public class TwoSumBruteForce {
    public static int[] twoSum(int[] nums,int target){
        int[] answer = new int[2];
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    answer[0] = i;
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,2,15};
        int target = 4;
        int[] answer = twoSum(nums,target);
        System.out.print("answers : ");
        for(int num : answer){
            System.out.print(num+" ");
        }
    }
}
