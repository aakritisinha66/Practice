package com.crux.function_array;

import java.util.Scanner;

public class LowerAndUpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int find = sc.nextInt();
		int lower_index = lower(arr, n, find);
		System.out.println(lower_index);
		int upper_index = upper(arr, n, find);
		System.out.println(upper_index);
	}
	
	public static int lower(int[] arr, int n, int find) {
		int index = -1;
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int mid  = (start+end)/2;
			if(arr[mid]==find) {
				index = mid;
				end = mid-1;
			}
			else if(arr[mid]>find) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return index;
		
	}
	
	public static int upper(int[] arr, int n, int find) {
		int index = -1;
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int mid  = (start+end)/2;
			if(arr[mid]==find) {
				index = mid;
				start = mid+1;
			}
			else if(arr[mid]>find) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return index;
	}

}
