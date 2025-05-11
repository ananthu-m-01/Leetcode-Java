package week03;

public class FirstOccurrenceString {
    public static int  firstOccurrenceString(String haystack, String needle) {
        int j = 0,index = 0,startIndex = 0;
        for(int i = 0;i < haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == 0){
                    startIndex = i;
                }
                j++;
                if(j == needle.length()){
                    index = i - j;
                    return index+1;
                }
            }else{
                if(j != 0){
                    i = startIndex;
                }
                j = 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack  = "mississippi";
        String needle = "issip";
        int answer = firstOccurrenceString(haystack,needle);
        System.out.println("answer : "+answer);
    }
}
