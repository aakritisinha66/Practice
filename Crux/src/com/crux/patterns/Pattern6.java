package com.crux.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row-1; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=n-row+1; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

