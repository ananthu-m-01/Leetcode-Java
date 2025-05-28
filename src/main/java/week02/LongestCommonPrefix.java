package week02;

public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs) {
        int strLength = 0;
        for(int i = 1;i < strs.length;i++){
            int j = 0,count =0;
            while(j < strs[0].length() && j < strs[i].length()){
                if(strs[0].charAt(j) == strs[i].charAt(j)){
                    count++;
                }else{
                    break;
                }
                j++;
            }
            if(i == 1){
                strLength = count;
            }else{
                strLength = Math.min(strLength,count);
            }
        }
        return strs[0].substring(0,strLength);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String answer = findLongestCommonPrefix(strs);
        System.out.println("answer : "+answer);
    }
}
