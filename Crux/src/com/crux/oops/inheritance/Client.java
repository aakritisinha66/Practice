package com.crux.oops.inheritance;

public class Client {
	
	public static void main(String[] args) {
//		CASE 1 Reference and instance both are Parent
		System.out.println("CASE 1");
		Parent obj1 = new Parent();
		System.out.println("Parent number 1: "+obj1.num1);
		System.out.println("Parent number 2: "+obj1.num2);
		obj1.function1();  //Parent Function
		
//		CASE 2 Reference is Parent and instance is Child
		System.out.println("CASE 2");
		Parent obj2 = new Child();
		System.out.println("Parent number 1: "+obj2.num1);  
		System.out.println("Parent number 2: "+obj2.num2); 
		System.out.println("Child number 2: "+((Child)obj2).num2);
		System.out.println("Child number 3: "+((Child)obj2).num3);   //While writing (LHS), obj2 is of Parent type, to fool compiler, we need to type cast it.
		obj2.function1();                                  //Child Function 1
		((Parent)obj2).function1();                         //Child Function 1. Child is on RHS/Instance.
		
//		CASE 3 Reference is Child and instance is Parent
//		System.out.println("CASE 3");
//		Child obj3 = new Parent();                          //This is not allowed because of run time error.
//		System.err.println("Parent number 1: "+obj3.num1);
//		System.out.println("Parent number 2: "+obj3.num2);
//		System.out.println("Child number 3: "+obj3.num3);   //Run time error, as space is allocated to RHS 
		
//		CASE 4 Reference and instance both are Child
		System.out.println("CASE 4");
		Child obj4 = new Child();
		System.out.println("Parent number 1: "+obj4.num1);
		System.out.println("Parent number 2: "+((Parent)obj4).num2);  
		System.out.println("Child number 2: "+obj4.num2);
		System.out.println("Child number 3: "+obj4.num3);
		obj4.function1();      //Child Function 1
		((Parent)obj4).function1();      //Child Function 1  Why? Because unlike members, functions gets resolved based on RHS or Instance. Members gets resolved based on LHS or Reference.
		obj4.function2();      //Child Function 2
	}
}
//For function, RHS value gets printed (gets resolved based on Reference).
//For data members, LHS value gets printed (gets resolved based on Instance).
