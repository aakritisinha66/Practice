package com.crux.function_array;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            display(arr);
            process(arr);
        }
    }
    public static void process(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
        }

    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        return;
    }
    
}

// 1
// 5
// 54 546 548 60 7
// Check first digit of 
