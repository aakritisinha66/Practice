package com.neetCode250;

import java.util.ArrayList;
import java.util.List;

public class encodingDecoding {
    public static String encode(List<String> strs) {
        StringBuilder strBldr = new StringBuilder();
        for (String st : strs) {
            strBldr.append(st.length());
            strBldr.append("#");
            strBldr.append(st);
        }
        return strBldr.toString();
    }

    public static List<String> decode(String str) {
        // 7#aakriti5#works2#in6#gurgao
        List <String> listOfStrings = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            StringBuilder tempStr = new StringBuilder();
            char[] charArr = str.toCharArray();
            if(Character.isDigit(charArr[i])) {
                int length = charArr[i] - '0';
                i++;
                int j = 0;
                while(j<length) {
                    if(charArr[i] == '#') {
                        //skip
                        i++;
                        j++;
                    }
                    else {
                        tempStr.append(charArr[i]);
                        j++;
                    }
                }
            }
            System.out.println(tempStr);
        }
        return listOfStrings;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("aakriti");
        strs.add("works");
        strs.add("in");
        strs.add("gurgao");

        String encoded = encode(strs);
        // System.out.println(encoded);
        List<String> decoded = decode(encoded);
    }

}
