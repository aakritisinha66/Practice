package com.crux.string;

public class ReverseString {
    public static void main(String[] args){
        StringBuilder original = new StringBuilder("abc");
        StringBuilder reverse = new StringBuilder();

        for(int i = original.length()-1; i>=0; i--){
            char current = original.charAt(i);
            reverse.append(current);
        }
        System.out.println(reverse);
    }
}


