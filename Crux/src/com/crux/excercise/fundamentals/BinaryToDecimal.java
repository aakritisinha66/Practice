package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int power = 0;
		int answer=0;
		while (binary!=0) {
//			System.out.println(binary);
			int remainder = binary%10;
			answer+=remainder*(Math.pow(2, power++));
			binary = binary/10;
		}
		System.out.println(answer);
		

	}

}
