package com.crux.collection_framework.basics;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , String> tree = new TreeMap<String, String>();
		tree.put("One", "ABC");
		tree.put("Two", "DEF");
		tree.put("Three", "PQR");
		tree.put("Four", "XYZ");
		
		System.out.println(tree);
		
		tree.remove("Four");
		System.out.println(tree);


        //Rest of the functions are similar to HashMap.
		
		

	}

}
