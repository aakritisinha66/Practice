package com.crux.collection_framework.basics.collection_class;

import java.util.Objects;

public class StudentComparable implements Comparable<StudentComparable>{
	private Integer roll;
	private String name;
	private String address;
	private String contact;
	
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
	
	@Override
    public String toString() {
        // This default implementation concatenates the class name of the object with the "@" symbol and the hexadecimal string representation of the object's hash code.
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
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
		StudentComparable other = (StudentComparable) obj;
		return Objects.equals(roll, other.roll);
	}
	@Override
	public int compareTo(StudentComparable student) {
//		return this.roll - student.roll;
		return this.name.compareTo(student.name);
	}
	
	

}

