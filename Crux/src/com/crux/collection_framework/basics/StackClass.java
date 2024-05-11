package com.crux.collection_framework.basics;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		st.push("ABC");
		st.push("MNO");
		st.push("XYZ");
		
		System.out.println(st);

		System.out.println(st.peek());

		st.pop();
		System.out.println(st);

	}

}
