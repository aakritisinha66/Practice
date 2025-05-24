package com.interviewPractice;

import java.util.Scanner;

public class Palindrome {
    // Input:- ABCBA
    // Output:- True
    // public static boolean isPalindrome(String str) {
    //     int start = 0;
    //     int end = str.length() - 1;
    //     boolean flag = true;
    //     while (start < end) {
    //         if (str.charAt(start) != str.charAt(end)) {
    //             flag = false;
    //             break;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return flag;
    // }

    public static String reverse(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }

    public static boolean isPalindrome(String str) {
        if(str.equals(reverse(str))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Is Palindrome? " + isPalindrome(str));
    }
}
