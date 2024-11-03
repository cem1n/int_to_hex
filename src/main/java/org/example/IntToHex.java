package org.example;

public class IntToHex {
    public static int searchForRemainder (int x){
        int remainder = 0;
        for(int index = 0;index < 4;++index){
            remainder = remainder + (x & 1) * (int)(Math.pow(2, index));
            x >>= 1;
        }
        return remainder;
    }

    public static String intToHex(int value) {
        String[] mas = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        StringBuilder Hex = new StringBuilder();
        boolean negative = value < 0;

        if (value == 0) {
            return "0";
        }

        if (negative) {
            value = value * -1;
        }

        while (value != 0) {
            int c = searchForRemainder(value);
            Hex.insert(0, mas[c]);
            value >>= 4;
        }
        if (negative) {
            Hex.insert(0, "-");
        }
        return Hex.toString();
    }
}