package com.crux.recursion;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n, 1, 1);
    }
    // public static void pattern(int n, int row, int col){
    //     if(row == n+1){
    //         return;
    //     }
    //     for(int i=1; i<=col; i++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     pattern(n, row+1, col+1);
    // }
    //OR (Below is correct)
    public static void pattern(int n, int row, int col){
        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            pattern(n, row+1, 1);
            return;
        } 
        System.out.print("*");
        pattern(n, row, col+1);
    }
    
}
