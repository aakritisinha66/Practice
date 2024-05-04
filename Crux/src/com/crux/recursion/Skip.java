package com.crux.recursion;

import java.util.Scanner;

public class Skip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        callRec(n);
    }
    public static void callRec(int n){
        if(n<=0){  //Base case
            return;
        }
        // if(n%2==0){
        //     callRec(n-1);
        //     System.out.println(n);
        // }
        // else{
        //     System.out.println(n);
        //     callRec(n-1);
        // }
        //OR
        if(n%2!=0){
            System.out.println(n);
        }
        callRec(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }
    
}
