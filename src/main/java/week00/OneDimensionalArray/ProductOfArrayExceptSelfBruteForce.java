package week00.OneDimensionalArray;

public class ProductOfArrayExceptSelfBruteForce {
    public static int[] productOfArrayExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int num = 1;
            for(int j = 0; j < nums.length;j++){
                if(i != j){
                    num*=nums[j];
                }
            }
            answer[i] = num;
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
