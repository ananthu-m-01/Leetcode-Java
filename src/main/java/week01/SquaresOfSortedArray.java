package week01;

public class SquaresOfSortedArray {
    public static int[] squarerOfSortedArray(int[] nums){
        int i =0,j = nums.length-1,count = nums.length-1;
        int[] answer = new int[nums.length];
        while(i <= j){
            int leftSquare = nums[i]*nums[i];
            int rightSquare = nums[j]*nums[j];
            if(leftSquare > rightSquare){
                answer[count] = leftSquare;
                i++;
            }else{
                answer[count] = rightSquare;
                j--;
            }
            count--;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] answer = squarerOfSortedArray(nums);
        System.out.println("Square of Sorted Array");
        for(int num : answer){
            System.out.print(num+" ");
        }
    }
}
