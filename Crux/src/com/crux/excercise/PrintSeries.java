package com.crux.excercise;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int count=1;
		
		while(n1>0) {
			if((3*count+2)%n2!=0) {
				System.out.println(3*count+2);
				count++;
				n1--;
			}
			else
				count++;
		}

	}

}
