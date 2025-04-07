package week00.OneDimensionalArray;

import java.util.Scanner;

public class CharityEvent {
    public static int charityEvent(int numberOfStudent){
        int chocolate = 0;
        for(int i = 1;i <= numberOfStudent;i++){
            chocolate += i;
            if(i%5 == 0){
                chocolate+=4;
            }
        }
        return chocolate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of children :");
        int numberOfChildren = scanner.nextInt();
        int chocolates = charityEvent(numberOfChildren);
        System.out.println("Total number of chocolate : "+chocolates);
    }
}
