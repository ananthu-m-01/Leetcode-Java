package week01;

public class ReverseString {
    public static void reverseString(char[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("reversed array");
        for(char num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
    }
}
