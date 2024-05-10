package com.crux.recursion;

import java.util.Scanner;

public class AllIndices {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int find = sc.nextInt();
        int[] result = new int[n];  //Taking extra space. Not memory efficient.
        result = indices(arr, 0, find, result, 0);
        display(result);
        
    }
    
    public static int[] indices(int[] arr, int i, int find, int[] result, int j){
        if(i==arr.length-1){
            return result;
        }
        if(arr[i]==find){
            result[j] = i;
            return indices(arr, i+1, find, result, j+1);
        }
        return indices(arr, i+1, find, result, j);
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }
    
}
