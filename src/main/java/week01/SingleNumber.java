package week01;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        int answer = 0;
        for (int num : nums){
            answer ^= num;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,2,2,4,1,1};
        int answer = singleNumber(nums);
        System.out.println("answer : "+answer);
    }
}
