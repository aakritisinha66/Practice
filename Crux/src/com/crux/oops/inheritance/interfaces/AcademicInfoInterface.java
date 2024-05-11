package com.crux.oops.inheritance.interfaces;

import java.util.List;
import java.util.Map;

public interface AcademicInfoInterface {
	void setGPA(double gpa);
	double getGPA();
	
	void setCourses(List<String> courses);
	List<String> getCourses();
	
	void setGrades(Map<String, Double> grades);
	Map<String, Double> getGrades();
	
}
