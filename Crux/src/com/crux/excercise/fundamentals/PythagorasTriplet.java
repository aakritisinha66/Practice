package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {
//		[m^2+n^2, 2mn, m^2-n^2] 
//		largest = m^2+n^2,
//		even = 2mn
//		odd = m^2-n^2
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if(n<=2){
			System.out.println("-1");
			return;
		}
		long a,b;
		if(n%2!=0) {
			a = (n+1)/2;
			b = (n-1)/2;
			System.out.println((2*a*b)+" "+(a*a+b*b));
		}
		else {
			a = n/2;
			b = 1;
			System.out.println((a*a-b*b)+" "+(a*a+b*b));
		}
		
			
	}

}
