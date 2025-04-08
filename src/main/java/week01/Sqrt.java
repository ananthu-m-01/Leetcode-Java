package week01;

public class Sqrt {
    public static int mySqrt(int x) {
        long start = 1, end = x/2, mid = 0;
        if(x <= 1){
            return x;
        }
        while(start < end){
            mid = (start + end)/2;
            if((mid * mid) < x){
                start = mid+1;
            }else if((mid * mid) > x){
                end = mid-1;
            }else{
                return (int)mid;
            }
        }
        long ans =  (int) (start+end)/2;
        if(ans * ans > x){
            return (int)ans-1;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int n = 2147483647;
        int ans = mySqrt(n);
        System.out.println("answer : "+ans);
    }
}
