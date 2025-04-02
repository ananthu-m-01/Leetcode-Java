package week00.String;

public class DecryptionPassword {
    public static void decryptionPassword(String str){
        char ch,updatedCh;
        int ascii;
        char[] answer = new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            ascii = (int) ch+1;
            if(ch == 'a'){
                answer[i] = 'z';
            }
            else{
                updatedCh = (char) ascii;
                answer[i] = updatedCh;
            }
        }
        System.out.println("Updated Password");
        for(char value : answer){
            System.out.print(value);
        }
    }
    public static void main(String[] args) {
        String c = "abcd";
        System.out.println("original password");
        System.out.println(c);
        decryptionPassword(c);
    }
}
