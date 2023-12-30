package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class CumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cum_sum = num;
		while (cum_sum>=0) {
			System.out.println(num);
			num = sc.nextInt();
			cum_sum+=num;
		}

	}

}
