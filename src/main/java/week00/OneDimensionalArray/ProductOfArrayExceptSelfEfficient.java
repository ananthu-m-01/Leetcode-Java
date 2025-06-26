package week00.OneDimensionalArray;

public class ProductOfArrayExceptSelfEfficient {
    public static int[] productOfArrayExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[right.length-1] = 1;
        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = right.length-2; i >= 0;i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] answer = productOfArrayExceptSelf(nums);
        System.out.println("updated array");
        for(int num : answer){
            System.out.print(num + " ");
        }
    }
}
