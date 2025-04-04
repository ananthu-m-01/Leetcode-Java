package week00.OneDimensionalArray;

public class PerfectSquareCount {
    public static int perfectSquareCount(int[] nums){
        int count = 0;
        for(int num : nums){
            int squareRoot = (int) Math.sqrt(num);
            if(squareRoot * squareRoot == num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,16,9,81,17,10,8};
        int ans = perfectSquareCount(nums);
        System.out.println("answer : "+ans);
    }
}
