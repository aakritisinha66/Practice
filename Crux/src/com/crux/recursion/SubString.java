package com.crux.recursion;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subStr(str, "");
    }
    public static void subStr(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }

        subStr(str.substring(1), result );
        subStr(str.substring(1), result+str.charAt(0));
    }
    
}
