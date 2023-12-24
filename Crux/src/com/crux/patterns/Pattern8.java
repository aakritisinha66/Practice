package com.crux.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0 || n<=1) {
			System.out.print("Enter an odd number which is greater than 1.");
			return;
		}
		int star;
		int space;
		for(int row=1; row<=n; row++) {
			if(row>n/2+1) {    //For second half rows
				star = row-n/2-1;
			    space = 2*(n-row)+1;
			}
			else {             //For second half rows
				star = n/2-row+1;
			    space = 2*row-1;
				
			}
			for(int col=1; col<=star; col++) {
				System.out.print("*");
			}
			for(int col=1; col<=space; col++) {
				System.out.print(" ");
			}
			for(int col=1; col<=star; col++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}



