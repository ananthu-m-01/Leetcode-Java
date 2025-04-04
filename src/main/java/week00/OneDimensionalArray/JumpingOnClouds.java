package week00.OneDimensionalArray;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    public static int jumpingOnClouds(List<Integer> C){
        int i =0,count = 0;
        while(i < C.size()-1){
            if(i+2 < C.size() && C.get(i+2) == 0){
                i+=2;
            }
            else{
                i++;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> C = Arrays.asList(0,0,0,1,0,0);
        int ans = jumpingOnClouds(C);
        System.out.println("answer : "+ans);
    }
}
