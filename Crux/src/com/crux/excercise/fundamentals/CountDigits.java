package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int digit = sc.nextInt();
		int count=0;
		while (number!=0) {
			int remainder = number%10;
//			System.out.println("Checkpoint:- "+remainder+" "+digit);
			if(remainder==digit) {
				count++;
//				System.out.println("Count:- "+count);
			}
				
			number = number/10;
		}
		System.out.println(count);

	}

}
