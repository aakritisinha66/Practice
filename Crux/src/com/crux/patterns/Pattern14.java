package com.crux.patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=2*row-1; col++) {
				if(col%2!=0)
					System.out.print(row + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=n-1; row>=1; row--) {
			for(int col=1; col<= 2*row-1;col++)
			{
				if(col%2!=0)
					System.out.print(row + " ");
				else
					System.out.print("* ");	
			}
			System.out.println();
		}

	}

}