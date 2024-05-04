package com.crux.string;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean is = palindrome(str);
        if(is) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
    public static boolean palindrome(String str){
        int len = str.length();
        int mid = len/2;
        System.out.println(mid);
        for(int i=0; i<mid; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    
}
