package com.crux.recursion;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutation(str, 0, str.length()-1);
    }
    public static void permutation(String str, int left, int right){
        if(left==right){
            System.out.println(str);
            return;
        }
        for(int i= left; i<=right; i++){
            String swapped = swap(str, left, i);
            permutation(swapped, left+1, right);
        }

    }

    public static String swap(String str, int a, int b){
        char[] charArray = str.toCharArray();
        char temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;

        return String.valueOf(charArray);
    }
    
}
