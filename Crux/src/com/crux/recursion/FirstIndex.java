package com.crux.recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int index= first(arr, 0, find);
        System.out.println("If present? "+ index);
    }
    public static int first(int[] arr, int i, int find){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]==find) return i;        
        else return first(arr, i+1, find);
    }
    
}
