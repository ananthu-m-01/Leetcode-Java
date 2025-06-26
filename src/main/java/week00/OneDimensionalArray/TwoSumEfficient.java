package week00.OneDimensionalArray;

import java.util.HashMap;

public class TwoSumEfficient {
    public static int[] twoSum(int[] nums, int target){
        int[] answer = new int[2];
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int value = target - nums[i];
            if(count.containsKey(value)){
                answer[0] = count.get(value);
                answer[1] = i;
                break;
            }
            count.put(nums[i],i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,11,7,12,4,1,3,5};
        int target = 6;
        int[] answer = twoSum(nums,target);
        System.out.print("index : ");
        for(int num : answer){
            System.out.print(num+ " ");
        }
    }
}
