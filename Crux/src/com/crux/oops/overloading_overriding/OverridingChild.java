package com.crux.oops.overloading_overriding;

public class OverridingChild extends OverridingParent{
	@Override
	public void function1() {
		System.out.println("Child Function 1");
	}
//	@Override   //Static methods can't be overridden
	public static void function2() {
		System.out.println("Child Static Function 2");
	}

}
