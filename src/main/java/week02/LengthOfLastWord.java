package week02;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        int count = 0;
        String str = s.trim();
        if(str.length()<=0){
            return count;
        }
        for(int i=0;i<str.length();i++){
            count++;
            if(str.charAt(i)==' '){
                count = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int answer = lengthOfLastWord(s);
        System.out.println("answer: "+answer);
    }
}
