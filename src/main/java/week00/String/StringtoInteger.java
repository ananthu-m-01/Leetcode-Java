package week00.String;

public class StringtoInteger {
    public static void main(String[] args) {
        String s = "21474836460";
        long k = 0;
        boolean isNegative = false;
        s = s.trim();
        if (s.startsWith("-")) {
            isNegative = true;
            s = s.substring(1);
        }
        if (s.startsWith("+") && !isNegative) {
            s = s.substring(1);
        }
        if (isNegative && s.startsWith("+")) {
          System.out.println("answer found : "+ 0);
        }
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10+(ch - '0');
            }else{
                break;
            }
        }
        if(isNegative){
            k*=-1;
        }

        System.out.println("number : "+ k);
    }
}
