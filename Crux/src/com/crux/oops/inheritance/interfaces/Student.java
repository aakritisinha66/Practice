package com.crux.oops.inheritance.interfaces;

import java.util.List;
import java.util.Map;

public class Student implements StudentManagementInterface{
	private String name;
	private String address;
	private String contact;
	private double gpa;
	private List<String> courses;
	private Map<String, Double> grades;

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public void setContact(String contact) {
		// TODO Auto-generated method stub
		this.contact = contact;
		
	}

	@Override
	public String getContact() {
		// TODO Auto-generated method stub
		return contact;
	}

	@Override
	public void setGPA(double gpa) {
		// TODO Auto-generated method stub
		this.gpa = gpa;
		
	}

	@Override
	public double getGPA() {
		// TODO Auto-generated method stub
		return gpa;
	}

	@Override
	public void setCourses(List<String> courses) {
		// TODO Auto-generated method stub
		this.courses = courses;
		
	}

	@Override
	public List<String> getCourses() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public void setGrades(Map<String, Double> grades) {
		// TODO Auto-generated method stub
		this.grades = grades;
		
	}

	@Override
	public Map<String, Double> getGrades() {
		// TODO Auto-generated method stub
		return grades;
	}
	
	@Override
	public void displayDetails() {
		System.out.println(name+", "+address+", "+contact+", "+courses+", "+gpa+", "+grades);
	}

}
