package com.crux.oops.overloading_overriding;

public class Overloading {
	
	public static void display(int... args) {
		System.out.print("Varargs function: ");
		for(int num: args) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
	
	public static void display(int a, int b) {
		System.out.println("First Function: "+a+" "+b);
	}
	
	public static void display(int a, int b, int c) {
		System.out.println("Second Function: "+a+" "+b+" "+c);
	}
	
	public static void display(String str) {
		System.out.println("Third Function: "+str);
	}
	
	public static void main(String[] args) {
		display(1,2);
		display(1,2,3);
		display("Hello");
		display(1,2,3,4,5,6,7,8,9);
	}
}
