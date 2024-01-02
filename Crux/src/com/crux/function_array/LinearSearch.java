package com.crux.function_array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int find = sc.nextInt();
		
		int index = linear(arr, n, find);
		if(index!=-1)
			System.out.println("Found at index: "+index);
		else
			System.out.println("Not found");

	}
	public static int linear(int[] arr, int n, int find) {
		for(int i=0; i<n; i++) {
			if(arr[i]==find) {
				return i;
			}
		}
		return -1;
	}
	

}
