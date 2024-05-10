package com.crux.oops;

public class BasicClass {
    String name;
    int age;
    
    final String group = "ABC";
    
    final void display() {
    	System.out.println("Final Method");
//    	The final field BasicClass.group cannot be assigned
//    	group = "XYZ";
    }
    
    static int count = 0;
    
    static void increament() {
//    	count++;
    	BasicClass.count++;
    }
    
    static{
    	System.out.println("Static block");
    }
    
    
    BasicClass(){
    	
    }
    BasicClass( int age, String name){
    	this.age = age;
    	this.name = name;
    }
}
