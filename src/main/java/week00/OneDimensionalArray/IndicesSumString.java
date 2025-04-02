package week00.OneDimensionalArray;

public class IndicesSumString {
    public static int indicesSumString(String str){
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return str.length()-1;
        }
        int j =str.length()-1;
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(str.charAt(i) + " " +str.charAt(j));
                return str.length()-i-1;
            }
            count++;
            j--;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "MMLAYALAM";
        int ans = indicesSumString(str);
        System.out.println(ans);
    }
}
