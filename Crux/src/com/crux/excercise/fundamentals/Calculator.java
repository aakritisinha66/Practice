package com.crux.excercise.fundamentals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char symbol = sc.next().charAt(0);
			if((symbol =='+') || (symbol == '-') || (symbol == '*') || (symbol == '/') || (symbol == '%')) {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				if(symbol == '+')
					System.out.print(n1+n2);
				else if(symbol == '-')
					System.out.print(n1-n2);
				else if(symbol == '*')
					System.out.print(n1*n2);
				else if(symbol == '/')
					System.out.print(n1/2);
				else if (symbol == '%')
					System.out.print(n1%n2);
				
			}
			else if(symbol == 'X' || symbol == 'x') 
				break;
	
			else 
				System.out.println("Invalid operation. Try again.");
		}

	}

}
