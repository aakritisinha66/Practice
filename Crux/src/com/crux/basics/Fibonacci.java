package com.crux.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 3;
		int first = 0;
		int second = 1;
		int sum = 0;
		System.out.print(first+" ");
		System.out.print(second+" ");
		while(start<=number) {
			sum = first + second;
			first = second;
			second = sum;
			start++;
			System.out.print(sum+" ");
		}
	}

}
