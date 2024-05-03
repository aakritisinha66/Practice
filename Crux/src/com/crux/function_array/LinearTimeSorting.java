package com.crux.function_array;

import java.util.Scanner;

public class LinearTimeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); //Each input element x, such that x ∈ { 0, 1, 2 }.
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        // display(arr);
        int[] sortedArray = sort(arr);
        display(sortedArray);
    }

    public static int[] sort(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        
        while (mid <= end) {
            if (arr[mid] == 0) {
                // swap(arr, start, mid);
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;

                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        return;
    }
    // public static int[] swap(int[] arr, int a, int b){
    // int temp = arr[a];
    // arr[a]= arr[b];
    // arr[b]=temp;
    // return arr;
    // }

}
