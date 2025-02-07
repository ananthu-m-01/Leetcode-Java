package week01;

import java.util.ArrayList;
import java.util.HashSet;

public class InterSectionOfTwoArrays {
    public static int[] interSectionOfTwoArrays(int nums1[],int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                answer.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] nums = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            nums[i] = answer.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] answer = interSectionOfTwoArrays(nums1,nums2);
        System.out.println("answer");
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
