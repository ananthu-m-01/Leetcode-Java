package week00.String;

public class SeriesOfCharacter {
    public static void findSeries(String str){
        for(int i = 0; i < str.length();i++){
            System.out.print((int)str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "123456789011";
//        a3b5c2a2
        findSeries(str);
    }
}
