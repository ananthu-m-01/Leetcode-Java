package week00;

public class ReverseString {
    public static String revesestring(String str){
        String reversedString = "";
        char temp;
        for (int i = str.length()-1;i >= 0;i--){
            temp = str.charAt(i);
            reversedString += temp;
        }
        return reversedString;
    }
    public static void main(String[] args) {
        String str = "DATA STRUCTURES USING JAVA";
        String reversedStr = revesestring(str);
        System.out.println("original string : "+str);
        System.out.println("reversed string : "+reversedStr);
    }
}
