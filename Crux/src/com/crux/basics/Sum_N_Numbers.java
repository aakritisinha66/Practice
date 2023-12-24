package com.crux.basics;

import java.util.Scanner;

public class Sum_N_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = number;
		int sum = 0;
		while(number>0) {
			sum += number;
			number--;
		}
		System.out.println("Sum of "+n+" natural numbers: "+sum);
	}

}
