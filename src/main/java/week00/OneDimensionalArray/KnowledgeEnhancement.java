package week00.OneDimensionalArray;

import java.util.Scanner;

public class KnowledgeEnhancement {
    public static void bubbleSort(int[] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j =0;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static int knowledgeEnhancement(int[] readingTime,int availableHours){
        int count = 0,hour = 0;
        for(int num : readingTime){
            hour += num;
            if(hour > availableHours){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the total number of books : ");
        int numberOfBooks = scanner.nextInt();
        int[] readingTime = new int[numberOfBooks];
        for(int i = 0; i< numberOfBooks;i++){
            System.out.print("enter the reading time for book "+i+" : ");
            readingTime[i] = scanner.nextInt();
        }
        System.out.print("\nenter the available reading hours :");
        int availableHours = scanner.nextInt();
        bubbleSort(readingTime);
        int answer = knowledgeEnhancement(readingTime,availableHours);
        System.out.println("answer : "+answer);
    }
}
