package com.crux.oops.overloading_overriding;

public class OverridingClient {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild obj = new OverridingChild();
		obj.function1();       //Child Function 1
		obj.function2();       //Child Static Function 2
		
		OverridingParent obj1 = new OverridingChild();
		obj1.function1();      //Child Function 1. Because method resolution for non-static methods are determined at run-time (RHS).
		((OverridingParent)obj1).function1();  //Even if you type cast, you can't call Parent's non-static method if its overridden. Type cast won't change the behavior of overriding. The only way is to use super in Child's class overridden method.
		obj1.function2();      //Parent static function 2. Because method resolution for static methods are determined at compile-time (LHS). And static methods are associated with the class itself, rather than with any particular instance of the class.
	}

}
