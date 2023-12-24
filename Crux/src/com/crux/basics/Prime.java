package com.crux.basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = 2;
		boolean flag = false;
		while(counter<=number-1) {
			if(number%counter == 0) {
				System.out.println("Given number is not a prime number!");
				flag = true;
				break;
			}
			else {
			    counter++;
			}
		}
		if(flag!=true)
			System.out.println("Given number is a prime number!");

	}

}
