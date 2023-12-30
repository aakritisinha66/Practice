package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int steps = sc.nextInt();
		while(min<=max) {
			int celsius = (int) ((5.0/9.0)*(min-32));
			System.out.println(min+" "+celsius);
			min+=steps;
		}
	}
}
