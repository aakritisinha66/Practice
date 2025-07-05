package com.crux.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int number = sc.nextInt();
		int number = 5;
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
// 5
// 1 2 3 4 5
// 0 1 1 2 3

// n1 = 0 and n2 = 1     sum = n1 + n2
// n1 = n2 and n2 = sum  sum = n1 + n2
// n1 = n2 and n2 = sum  sum = n1 + n2

