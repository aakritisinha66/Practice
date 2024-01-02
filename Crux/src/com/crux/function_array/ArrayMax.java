package com.crux.function_array;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
		    if(arr[i]>= max) {
		    	max = arr[i];
		    }
		}
		System.out.println("Maximum: "+max);

	}

}
