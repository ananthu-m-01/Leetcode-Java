package week00.String;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decoded.append(current);
                }
                current = decoded;
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println("updated string : " + decodeString(s));
    }
}
