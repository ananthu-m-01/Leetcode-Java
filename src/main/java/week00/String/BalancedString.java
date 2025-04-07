package week00.String;

import java.util.HashMap;

public class BalancedString {
    public static int balancedString(String str){
        int balance = str.length()/4;
        HashMap<Character,Integer> count = new HashMap<>();
        count.put('Q',balance);
        count.put('W',balance);
        count.put('E',balance);
        count.put('R',balance);
        for(int i = 0;i<str.length();i++){
//            System.out.println(str.charAt(i)+" "+count.get(str.charAt(i)));
            int c = count.get(str.charAt(i))-1;
            count.put(str.charAt(i),c);
        }
        System.out.println(count);
        int val = 0;
        for (Character key : count.keySet()) {
            System.out.println("Key: " + key + ", Value: " + count.get(key));
            if(count.get(key) > 0){
                val+=count.get(key);
            }
        }
        return val;
    }
    public static void main(String[] args) {
        String str = "WQWRQQQW";
        System.out.println(str.length());
        int answer = balancedString(str);
        System.out.println("answer : "+answer);
    }
}
