package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num!=0) {
			int remainder = num%10;
			System.out.print(remainder);
			num = num/10;
		}

	}

}
