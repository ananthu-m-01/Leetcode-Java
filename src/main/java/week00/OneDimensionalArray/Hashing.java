package week00.OneDimensionalArray;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size for hash table");
        int size = scanner.nextInt();
        int[] hashTable = new int[size];
        boolean choice = true;
        while(choice){
            System.out.println("enter your choice");
            System.out.println(" 1: Insert\n 2: Find\n 3:Display");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("enter the number : ");
                    int number = scanner.nextInt();
                    int index = number % size;
                    hashTable[index] = number;
                    break;
                case 2:
                    System.out.println("enter the number");
                    int findNumber = scanner.nextInt();
                    int findIndex = findNumber % size;
                    if(hashTable[findIndex] == findNumber){
                        System.out.println("index : "+findIndex);
                    }else{
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    for (int num : hashTable){
                        System.out.print(num+ " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("invalid");
                    choice = false;
            }
        }
    }
}
