package com.crux.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1; row<=n; row++) {
			int val = row-1;
			for(int col=1; col<=n-row; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=(2*row)-1; col++) {
				
				if(col<=((2*row))/2) {
					System.out.print(col);
				}
				else {
					
					System.out.print(val--);
				}
			}
			System.out.println();
		}

	}
}
