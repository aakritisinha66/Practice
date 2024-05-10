package com.crux.recursion;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr, 0, 1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void bubble(int[] arr, int i, int counter){
        if(counter==arr.length-1){
            return;
        }
        if(i==arr.length-counter-1){
            bubble(arr, 0, counter+1);
            return;
        }
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        bubble(arr, i+1, counter);
    }
}
