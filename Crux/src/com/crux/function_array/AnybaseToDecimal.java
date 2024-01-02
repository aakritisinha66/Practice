package com.crux.function_array;

import java.util.Scanner;

public class AnybaseToDecimal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int source_n = sc.nextInt();
		int source_b = sc.nextInt();
		int binary=conversion(source_n, source_b);
		System.out.println(binary);

	}
	public static int conversion(int source_n, int source_b) {
		int answer = 0;
		int exp = 0;
		while(source_n != 0) {
			int rem = source_n%10;
			answer+=(rem*Math.pow(source_b, exp++));
			source_n/=10;
		}
		return answer;
	}

}
