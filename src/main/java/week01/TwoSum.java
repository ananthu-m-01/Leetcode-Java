package week01;

import java.util.HashMap;

public class TwoSum {

    // Problem Logic
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> answerHashmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int answer = target-nums[i];
            if(answerHashmap.containsKey(answer)){
                return new int[]{answerHashmap.get(answer),i};
            }
            answerHashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String[] args) {
        int[] nums = {2,7,1,11,15,1};
        int target = 2;
        int[] ans = twoSum(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
