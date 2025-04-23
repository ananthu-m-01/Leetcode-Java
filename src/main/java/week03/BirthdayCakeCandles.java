package week03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles){
        HashMap<Integer,Integer> candleHashMap = new HashMap<>();
        int max = candles.get(0);
        for(int i = 0;i < candles.size();i++){
            int n = candles.get(i);
            if(candleHashMap.get(n) != null){
                candleHashMap.put(n,candleHashMap.get(n)+1);
            }else{
                candleHashMap.put(n,1);
            }
            if(max < candles.get(i)){
                max = candles.get(i);
            }
        }
        return candleHashMap.get(max);
    }
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(4);
        candles.add(1);
        candles.add(2);
        candles.add(4);
        int numberOfCandle = birthdayCakeCandles(candles);
        System.out.println("number of candles : "+numberOfCandle);
    }
}
