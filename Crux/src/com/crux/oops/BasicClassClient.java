package com.crux.oops;

public class BasicClassClient {
    public static void main(String[] args){
        BasicClass d = new BasicClass();
        d.name = "Aakriti";
        d.age = 25;
        System.out.println(d.name);
        for(int i=0; i<5; i++) {
        BasicClass.increament();}
        System.out.println("Count: "+BasicClass.count);
    }
}
class Example extends BasicClass{
//	Cannot override the final method from BasicClass
//	void display() {
//		System.out.println();
//	}
	
}
