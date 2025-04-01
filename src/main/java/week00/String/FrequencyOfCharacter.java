package week00.String;

import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void frequencyOfCharacter(String str) {
        HashMap<Character,Integer> frequency = new HashMap<>();
        for(int i =0;i<str.length();i++){
            char value = str.charAt(i);
            if(! frequency.containsKey(value)){
                frequency.put(value,1);
            }else{
                frequency.put(value,frequency.get(value) + 1);
            }
        }
        System.out.println(frequency);
    }
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        frequencyOfCharacter(str);
    }
}
