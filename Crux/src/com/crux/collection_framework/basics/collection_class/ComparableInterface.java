package com.crux.collection_framework.basics.collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args){
        List<StudentComparable> list = new ArrayList<StudentComparable>();
		StudentComparable st = new StudentComparable();
		st.setRoll(10);
		st.setName("XYZ");
		st.setAddress("New Delhi");
		st.setContact("1234567890");
		
//		st1.displayDetails();	
		list.add(st);
		
		StudentComparable st1 = new StudentComparable();
		st1.setRoll(1);
		st1.setName("ABC");
		st1.setAddress("New Delhi");
		st1.setContact("2345678901");
		
//		st1.displayDetails();
		list.add(st1);

        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
    }
    
}
