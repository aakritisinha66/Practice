package com.interviewPractice;

import java.util.Scanner;

public class StringReverse1 {
    public static void main(String[] args) {
        // Input:- Hi Aakriti
        // Output:- iH itirkaA
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String[] stringArr = str.split(" ");
        for(String word: stringArr) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(result);
    }
    
}
