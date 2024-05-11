package com.crux.collection_framework.basics;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
	private Integer roll;
	private String name;
	private String address;
	private String contact;
	private double gpa;
	private List<String> courses;
	private Map<String, Double> grades;
	
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public Integer getRoll() {
		return roll;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
		
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public void setContact(String contact) {
		// TODO Auto-generated method stub
		this.contact = contact;
		
	}

	public String getContact() {
		// TODO Auto-generated method stub
		return contact;
	}

	public void setGPA(double gpa) {
		// TODO Auto-generated method stub
		this.gpa = gpa;
		
	}

	public double getGPA() {
		// TODO Auto-generated method stub
		return gpa;
	}

	public void setCourses(List<String> courses) {
		// TODO Auto-generated method stub
		this.courses = courses;
		
	}

	public List<String> getCourses() {
		// TODO Auto-generated method stub
		return courses;
	}

	public void setGrades(Map<String, Double> grades) {
		// TODO Auto-generated method stub
		this.grades = grades;
		
	}

	public Map<String, Double> getGrades() {
		// TODO Auto-generated method stub
		return grades;
	}
	
	@Override
    public String toString() {
        // This default implementation concatenates the class name of the object with the "@" symbol and the hexadecimal string representation of the object's hash code.
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", courses='" + courses + '\'' +
                ", gpa='" + gpa + '\'' +
                ", grades='" + grades + '\'' +
                '}';
    }
	
	//In Java, the hashCode() and equals() methods are used for object comparison and are crucial for correct behavior when objects are used in collections such as HashSet, HashMap.
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(roll, other.roll);
	}
	
	

}

