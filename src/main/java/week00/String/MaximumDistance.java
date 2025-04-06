package week00.String;

import java.util.Scanner;

public class MaximumDistance {
    public static int maximumDistance(String str){
        int leftCount = 0, rightCount = 0,leftAnswer = 0,rightAnswer = 0;
        for(int i =0,j = str.length()-1;i<str.length();i++){
            if(str.charAt(i) != str.charAt(j)){
                leftAnswer= str.length()-leftCount-1;
                break;
            }
            leftCount++;
        }
        for (int i = str.length()-1,j=0;i>=0;i--){
            if(str.charAt(i) != str.charAt(j)){
                rightAnswer = str.length()-rightCount-1;
                break;
            }
            rightCount++;
        }
        return Math.max(leftAnswer,rightAnswer);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the string :");
        String str = scanner.nextLine();
        int ans = maximumDistance(str);
        System.out.println("answer : "+ans);
    }
}
