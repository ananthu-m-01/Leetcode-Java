package week00.hashmap;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        String str = "ab";
        for(char c : str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        System.out.println("hashmap : "+hashMap);
    }
}
