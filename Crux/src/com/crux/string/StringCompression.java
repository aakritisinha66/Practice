package com.crux.string;
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        char curr = str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==curr){
                count++;
            }
            else{
                compressed.append(curr);
                if(count!=1) compressed.append(count);
                curr=str.charAt(i);
                count=1;
            }
        }
        compressed.append(curr);
        if(count!=1) compressed.append(count);
        System.out.println(compressed.toString());
    }
}