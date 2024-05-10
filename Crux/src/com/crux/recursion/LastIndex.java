package com.crux.recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Number to find");
        int find = sc.nextInt();
        int index = first(arr, 0, find);
        System.out.println("If present? "+ index);
    }
    public static int first(int[] arr, int i, int find){
        if(i == arr.length){
            return -1;
        }

        int index = first(arr, i+1, find);
        if(index == -1){
            if(arr[i] == find){
                return i;
            }
            else{
                return -1;
            }
        }
        else return index; //This part is for index 1. index will have value 3 from previor call.

    }
    
}
//0  1  2  3  4  5
//1  2  3  2  4  6
//                 -1   Value returned by base case
//3  3  3  3 -1 -1 -1   Value returned when stack is falling
