package com.crux.exception_handling;

public class Client {

//	public static void main(String[] args) throws Exception {   //If you do this, it will terminate the whole execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass obj = new StudentClass();
		obj.setName("Aakriti Kumari");
		try {
			obj.setAge(-25);
		}
		catch(Exception e) {
			System.out.println("Catch Block");
		}
		
		
//		System.out.println("Details: "+obj.age+" "+obj.name); //Because type is private.
		System.out.println("Details: "+obj.getAge()+" "+obj.getName());

	}

}
