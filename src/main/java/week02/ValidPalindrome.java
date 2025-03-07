package week02;

public class ValidPalindrome {
    public static boolean validPalindrome(String str){
        str = str.trim();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
        System.out.println("check str : "+str);
        for(int i = 0,j = str.length()-1; i<str.length() && j >=0; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "0P";
        System.out.println("The given string : "+str);
        if(validPalindrome(str)){
            System.out.println("The string is valid palindrome!");
        }else{
            System.out.println("The string is not valid palindrome!");
        }
    }
}
