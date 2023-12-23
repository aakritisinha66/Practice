package com.crux;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int divisor = sc.nextInt();
//		int dividend = sc.nextInt();
//		int remainder = divisor;
//		int HCF = divisor;
//		while(remainder != 0) {
//			System.out.println("Values: "+divisor+" "+dividend);
//			remainder = dividend%divisor;
//			dividend = divisor;
//			divisor = remainder;
//			if(divisor!= 0)
//				HCF = divisor;
//		}
//		System.out.println("HCF: "+HCF);
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		while(dividend%divisor != 0) {
			System.out.println("Values: "+divisor+" "+dividend);
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println("HCF: "+divisor);
	}

}
