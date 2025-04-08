package week01;

public class ClimbStairs {
    public static int climbStairs(int n){
        int a = 1,b = 1, c = 0;
        if(n <= 1){
            return n;
        }
        for(int i = 1;i < n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 3;
        int ans = climbStairs(n);
        System.out.println("answer : "+ans);
    }
}
