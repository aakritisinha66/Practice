package com.crux.oops.inheritance.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudenClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagementInterface st = new Student();
		st.setName("Aakriti");
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
		
		st.displayDetails();
		

	}

}
