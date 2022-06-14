package Arrays;

import java.util.ArrayList;

public class StringReverse {
    //O(n)
    static String getReversedString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0 ; i--)
            reversedString += str.charAt(i);
        return reversedString;
    }

    static String getReversedString2(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(getReversedString("Sudhanshu is nice!"));
        System.out.println(getReversedString2("Sudhanshu is Bad!"));
    }
}
