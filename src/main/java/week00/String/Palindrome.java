package week00.String;

public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i = 0, j = str.length()-1; i <str.length() && j>=0; i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str  = "MADAM";
        System.out.println("Given String : "+str);
        if(isPalindrome(str)){
            System.out.println("The give string is palindrome");
        }else{
            System.out.println("The given string is not palindrome");
        }
    }
}
