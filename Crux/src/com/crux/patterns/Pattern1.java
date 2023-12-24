package com.crux.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row = 0; row<n; row++) {
			System.out.print("*");
			System.out.print("\n");
		}
	}

}
