package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class IncreasingDecreasingSequence {
//	strictly increasing eg: 5 1 2 3 4 5 true inc (No dec)                    
//	strictly decreasing eg: 5 5 4 3 2 1 true dec inc (No dec)
//	strictly decreasing then strictly increasing eg: 3 2 1 2 3 true dec inc (No dec)
//	strictly increasing then strictly decreasing eg: 1 2 3 2 1 false inc (No dec)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int previous = sc.nextInt();
		boolean increase = false;
		boolean decrease = false;
		for(int i=2; i<=n; i++) {
			int current = sc.nextInt();
			if(current > previous) {
				increase = true;
			}
			else if(current < previous) {
				if(increase== false)
					decrease = true;
				else {
//					System.out.println("Checkpoint 1 : "+increase+" & "+decrease);
					System.out.println("false");
					return;
				}
			}
			else {
				//adjacent equal numbers
//				System.out.println("Checkpoint 2 : "+increase+" & "+decrease);
				System.out.println("false");
				return;
			}
			previous = current;
		}
//		System.out.println("Checkpoint 3 : "+increase+" & "+decrease);
		if(increase == false && decrease == true)
			System.out.println("true");
		else if(increase == true && decrease == false)
			System.out.println("true");
		else
			System.out.println(increase || decrease);
		

	}

}
