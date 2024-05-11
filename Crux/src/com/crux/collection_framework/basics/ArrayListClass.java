package com.crux.collection_framework.basics;

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
//		list.remove(2);
//		System.out.println(list);
//		
//		list.remove(Integer.valueOf(2));
//		System.out.println(list);
//		
//		list.clear();
//		System.out.println(list);
		
		list.set(2, 4);
		System.out.println(list);
		
		System.out.println(list.contains(2));
		
		for(int i=0;i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(Integer element: list) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		

	}

}
