package com.crux.function_array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int find = sc.nextInt();
		
		int index = binary(arr, n, find);
		if(index!=-1)
			System.out.println("Found at index: "+index);
		else
			System.out.println("Not found");

	}
	public static int binary(int[] arr, int n, int find) {
		
		int start =  0;
		int end = n-1;
		
		while(start<=end) {
			int mid  = (start+end)/2;
			if(find<arr[mid]) {
				end = mid-1;
			}
			else if(find>arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
			
		}
		return -1;
		
	}

}
