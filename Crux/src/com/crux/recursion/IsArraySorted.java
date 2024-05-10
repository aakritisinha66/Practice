package com.crux.recursion;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean is= sorted(arr, 0);
        System.out.println("Is it sorted?"+ is);
    }
    public static boolean sorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]> arr[i+1]) return false;  //Instant return false if any of the elemnt is wrongly placed
        else return sorted(arr, i+1);       //If rest of the array is sorted (assumtion) then only continue recursion
    }
    
}
