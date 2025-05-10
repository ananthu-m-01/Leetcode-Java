package week04;

public class ValidPerfectSquare {
    public static boolean isValidPerfectSquare(int num){
        long start = 1,end = num, mid = 0, number = num;
        if(number == 1){
            return true;
        }
        while (start < end){
            mid = (start+end)/2;
            long square = mid*mid;
            if(square == number){
                return true;
            }else if(square > number){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(start * start == number || end * end == number){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 104976;
        boolean answer = isValidPerfectSquare(number);
        System.out.println("answer : "+answer);
    }
}
