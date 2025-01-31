package week01;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> answerHashmap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(answerHashmap.containsKey(nums[i])){
                return true;
            }
            answerHashmap.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println("answer : "+ans);
    }
}
