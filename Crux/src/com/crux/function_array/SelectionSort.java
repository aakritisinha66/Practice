package com.crux.function_array;

import java.util.Scanner;

public class SelectionSort {
    // Find the minimum of whole array and place it at first i.e., first=counter+1 and counter will increase by 1 after each loop.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int counter = 0;
		while(counter<n-1) {
			int min = counter;
			for(int i=counter+1;  i<n; i++) {
				if(arr[i]<arr[min]) {
					min = i;
				}
			}
			swap(arr, min, counter);
			counter++;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+", ");
		}
		

	}
	
	public static void swap(int[] arr, int i, int j) {		
//		In Java, when you pass an array to a method, you are actually passing the reference to the array, not a copy of the array. 
		int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
	}

}
