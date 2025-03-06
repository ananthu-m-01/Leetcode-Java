package week01;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int []answer = productOfArrayExceptSelf(nums);
        System.out.println("answer array:");
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
    public static int[] productOfArrayExceptSelf(int[] nums){
        int product;
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product = 1;
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }
}
