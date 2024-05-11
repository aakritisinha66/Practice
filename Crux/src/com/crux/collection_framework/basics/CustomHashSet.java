package com.crux.collection_framework.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CustomHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		
		
		Student st = new Student();
		st.setRoll(1);
		st.setName("ABC");
		st.setAddress("New Delhi");
		st.setContact("1234567890");
		
		List<String> courses = new ArrayList<String>();
		courses.add("Computer");
		courses.add("Maths");
		st.setCourses(courses);
		
		Map<String, Double> grades = new HashMap<String, Double>();
		grades.put("Computer", 85.0);
		grades.put("Maths", 90.0);
		st.setGrades(grades);
		
		st.setGPA(8.0);
		
//		st1.displayDetails();	
		set.add(st);
		
		Student st1 = new Student();
		st1.setRoll(2);
		st1.setName("XYZ");
		st1.setAddress("New Delhi");
		st1.setContact("2345678901");
		
		List<String> courses1 = new ArrayList<String>();
		courses1.add("Computer");
		courses1.add("Maths");
		st1.setCourses(courses1);
		
		Map<String, Double> grades1 = new HashMap<String, Double>();
		grades1.put("Computer", 80.0);
		grades1.put("Maths", 95.0);
		st1.setGrades(grades1);
		
		st1.setGPA(8.5);
		
//		st1.displayDetails();
		set.add(st1);
		
//		System.out.println(set);
		
		// Print the values stored in the set
        for (Student student : set) {
            System.out.println(student);
        }

	}

}
