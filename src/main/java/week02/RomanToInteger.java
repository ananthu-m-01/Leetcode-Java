package week02;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInteger(String romanNumberString){
        int romanNumberInteger=0,firstNumber,secondNumber;
        HashMap<Character,Integer> romanNumberList = new HashMap<>();
        romanNumberList.put('I',1);
        romanNumberList.put('V',5);
        romanNumberList.put('X',10);
        romanNumberList.put('L',50);
        romanNumberList.put('C',100);
        romanNumberList.put('D',500);
        romanNumberList.put('M',1000);
        for(int i=0;i<romanNumberString.length();i++){
            if(romanNumberList.containsKey(romanNumberString.charAt(i))){
                System.out.println("roman number : "+romanNumberInteger);
                firstNumber = romanNumberList.get(romanNumberString.charAt(i));
                if(i<romanNumberString.length()-1) {
                    secondNumber = romanNumberList.get(romanNumberString.charAt(i+1));
                    if(firstNumber<secondNumber){
                        romanNumberInteger+=(secondNumber-firstNumber);
                        i++;
                    }else{
                        romanNumberInteger+=firstNumber;
                    }
                }
                else{
                    romanNumberInteger+=firstNumber;
                }
            }
        }
        return romanNumberInteger;
    }
    public static void main(String[] args) {
        String romanNumberString = "MCMXCIV";
        int answer = romanToInteger(romanNumberString);
        System.out.println("answer :"+answer);
    }
}
