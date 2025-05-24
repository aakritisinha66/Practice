package com.interviewPractice;

import java.util.Scanner;

public class StringReverse {
    public static String reverse(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        // Input:- ABC
        // Output:- CBA
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char[] reversed = new char[str.length()];
        // int start = 0;
        // int end = str.length()-1;
        // while(start<end) {
        //     reversed[start] =str.charAt(end);
        //     reversed[end] = str.charAt(start);
        //     start++;
        //     end--; 
        // }
        // System.out.println(reversed);

        //Recursion
        System.out.println(reverse(str));


    }
}
