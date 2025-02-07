package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class InterSectionOfTwoArraysII {
    public static int[] interSectionOfTwoArraysII(int[] nums1,int[] nums2){
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                answer.add(nums2[i]);
            }
        }
        ArrayList<Integer> finalArrayList = new ArrayList<>();
        for(int i=0;i<answer.size();i++){
            if(set.contains(answer.get(i))){
                finalArrayList.add(answer.get(i));
                set.remove(answer.get(i));
            }
        }
        int[] nums = new int[finalArrayList.size()];
        for(int i=0;i<finalArrayList.size();i++){
            nums[i] = finalArrayList.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] answer = interSectionOfTwoArraysII(nums1,nums2);
        System.out.println("answer");
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
