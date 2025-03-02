package week01;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int leftProduct = 1,leftMaxProduct = 0,rightMaxProduct = 0,rightProduct=1;
        for(int i=0,j=nums.length-1;i<nums.length && j>=0;i++,j--){
            leftProduct *= nums[i];
            rightProduct *= nums[j];
            System.out.println("left : "+leftProduct+" right : "+rightProduct);
            leftMaxProduct = Math.max(leftProduct,leftMaxProduct);
            rightMaxProduct = Math.max(rightProduct,rightMaxProduct);
            if(leftProduct == 0){
                leftProduct = 1;
            }
            if(rightProduct == 0){
                rightProduct = 1;
            }
        }
        return Math.max(leftMaxProduct,rightMaxProduct);
    }
    public static void main(String[] args) {
        int[] nums = {3,-1,4,-1};
        int answer = maxProduct(nums);
        System.out.println("answer : "+answer);
    }
}
