package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int answer=0;
		int exp=0;
		while (n!=0) {
			exp++;
			n = n/10;
		}
//		System.out.println("Exp:- "+exp);
		n = num;
		while (n!=0) {
//			System.out.println(binary);
			int remainder = n%10;
			answer+=(Math.pow(remainder, exp));
			n = n/10;
		}
//		System.out.println(num+" "+answer);
		System.out.println(answer==num);

	}

}
