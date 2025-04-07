package week00.OneDimensionalArray;

import java.util.Scanner;

public class CharityEvent {
    public static int charityEvent(int numberOfStudent){
        int chocolate = 0;
        int sum = (numberOfStudent * (numberOfStudent+1))/2;
        int bonus = (int)(numberOfStudent/5);
        chocolate = sum+(bonus*4);
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
