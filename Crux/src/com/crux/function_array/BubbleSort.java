package com.crux.function_array;

import java.util.Scanner;

public class BubbleSort {

	//Compare adjacent numbers (put largest at the end i.e., end=length-1-counter and counter will increase by 1 after each loop).

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
			for(int i=0;  i<n-1-counter; i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
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








