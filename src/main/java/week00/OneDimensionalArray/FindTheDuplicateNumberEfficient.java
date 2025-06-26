package week00.OneDimensionalArray;

import java.util.HashSet;

public class FindTheDuplicateNumberEfficient {
    public static int duplicateNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,1};
        System.out.println("duplicate number is : "+duplicateNumber(nums));
    }
}
