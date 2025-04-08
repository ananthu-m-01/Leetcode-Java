package week00.OneDimensionalArray;

import java.util.Scanner;

public class RedGreenPen {
    public static int findGreenPen(int[] nums){
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(i+1 < nums.length && nums[i]%2 == 1 && nums[i+1]%2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("total number you wanted to write : ");
        int totalNumber = scanner.nextInt();
        int numbers[] = new int[totalNumber];
        for(int i = 0;i < totalNumber;i++){
            System.out.print("enter number : ");
            numbers[i] = scanner.nextInt();
        }
        int answer = findGreenPen(numbers);
        System.out.println("\nTotal number of time you need to swap from green pen to red pen : " +answer);
    }
}
