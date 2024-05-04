package com.crux.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println(result);
    }
    public static int fact(int n){
        if(n==1){  //Base case
            return 1;
        }
        return n*fact(n-1);

    } 
}
// 5*4*3*2*1 => 5 * factorial of n-1
