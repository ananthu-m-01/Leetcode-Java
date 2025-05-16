package week02;

public class ExcelSheetColumnNumber {
    public static int findExcelSheetColumnNumber(String str){
        long index = 0;
        for(int i = 0; i<str.length();i++){
            int value = (int) str.charAt(i) - 'A' + 1;
            index = index * 26 + value;
        }
        return (int) index;
    }
    public static void main(String[] args) {
        String index = "FXSHRXW";
        int columnNumber = findExcelSheetColumnNumber(index);
        System.out.println("column number is : "+columnNumber);
    }
}
