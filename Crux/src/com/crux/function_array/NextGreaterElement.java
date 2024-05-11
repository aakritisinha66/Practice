package com.crux.function_array;

import java.util.Scanner;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int find = sc.nextInt();

		int found = process(arr, find, num);
		System.out.println("Found: " + found);

	}

	public static int process(int[] arr, int find, int num) {
		int max = -1;

		for (int i = 0; i < num; i++) {
			if (arr[i]>find && (max==-1 || arr[i]<max)){
				max = arr[i];
			}
		}
		return max;

	}
}

//2, 1, 3, 8, 6, 7, 5
