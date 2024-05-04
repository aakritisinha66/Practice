package com.crux.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    int result = powerOf(x, n);
    System.out.println(result);
    }
    public static int powerOf(int x, int n){
        if(n==0){
            return 1;
        }
        return x * powerOf(x, n-1);
    } 
}



// 2*2*2 x * x * x 
