package com.crux.exception_handling;

public class StudentClass {
	private String name;
	private int age;
	
	public StudentClass() {
		// TODO Auto-generated constructor stub
	}
	public StudentClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("Age can't be negative.");
		}
		this.age = age;
	}

}
