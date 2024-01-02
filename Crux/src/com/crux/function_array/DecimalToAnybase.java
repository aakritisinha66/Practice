package com.crux.function_array;

import java.util.Scanner;

public class DecimalToAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int source_n = sc.nextInt();
		int dest_b = sc.nextInt();
		int dest_n=conversion(source_n, dest_b);
		System.out.println(dest_n);

	}
	public static int conversion(int source_n, int dest_b) {
		int answer = 0;
		int exp = 0;
		while(source_n != 0) {
			int rem = source_n%dest_b;
			answer+=(rem*Math.pow(10, exp++));
			source_n/=dest_b;
		}
		return answer;
	}

}
