package week00.TwoDimensionalArray;

import java.util.Scanner;

public class MagicalLibrary {
    public static int magicalLibrary(int[][] library){
        int count = 0,sum = 0;
        for(int i = 0;i < library.length; i++){
            for(int j =0; j<library[i].length; j++){
                if(library[i][j] % 2 != 0){
                    sum+=library[i][j];
                }
            }
            if(sum % 2 == 0 && sum!= 0){
                count++;
            }
            sum = 0;
        }
        return count;
    }
    public static void main(String[] args) {
        int row,column;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        row = scanner.nextInt();
        System.out.print("Enter the column size : ");
        column = scanner.nextInt();
        int[][] library = new int[row][column];
        for(int i = 0; i< row;i++){
            for(int j =0; j<column;j++){
                System.out.print("Enter the number at position "+i+j+" : ");
                library[i][j] = scanner.nextInt();
            }
        }
        int answer = magicalLibrary(library);
        System.out.println("answer : "+answer);
    }
}
