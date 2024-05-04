package com.crux.string;

import java.util.Scanner;

public class Substrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();

        for (int i = 0; i < len; i++) {
            int count = i+1;
            while(count<len+1){
                // System.out.println("Debug: "+i+" "+count);
                System.out.println(str.substring(i, count));
                count++;
            }
        }
    }
}

