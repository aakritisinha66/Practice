package com.crux.recursion;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        callRec(n);
    }
    public static void callRec(int n){
        if(n==0){  //Base case
            return;
        }
        System.out.println(n); //5, 4, 3, 2, 1
        callRec(n-1);
        // System.out.println(n); //1, 2, 3, 4, 5

    }
    
}
