package week00;

public class SubString {
    public static void subString(String str1, String str2){
        int startIndex = -1;
        boolean found = false;
        int j = 0;
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) == str2.charAt(j)){
                if(j == 0){
                    startIndex = i;
                }
                j++;
                if(j == str2.length()-1){
                    found = true;
                    break;
                }
            }else{
                j = 0;
                startIndex = -1;
            }
        }
        if(found){
            System.out.println("Start index : "+startIndex);
            int endIndex = startIndex+str2.length()-1;
            System.out.println("End index   : "+endIndex);
        }else{
            System.out.println("The substring in not present");
        }
    }
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "world";
        subString(str1,str2);
    }
}
