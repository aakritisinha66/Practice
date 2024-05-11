package com.crux.collection_framework.basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(3, "XYZ");
		map.put(1, "DEF");  //It will override the value of 1.
		map.putIfAbsent(2, "MNO");  //It will not override the value of 2, if 2 is already there.
		
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		
//		for(Map.Entry<Integer, String> entry: map.entrySet()) {
//			System.out.println(entry);
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
//		
//		for(Integer key: map.keySet()) {
//			System.out.println(key);
//		}
//		
//		for(String value: map.values()) {
//			System.out.println(value);
//		}
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("PQR"));
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);

	}

}
