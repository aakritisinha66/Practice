package com.crux.collection_framework.basics.collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	public static void main(String[] args) {
		List<StudentComparator> list = new ArrayList<StudentComparator>();
		StudentComparator st = new StudentComparator();
		st.setRoll(10);
		st.setName("XYZ");
		st.setAddress("New Delhi");
		st.setContact("1234567890");

		// st1.displayDetails();
		list.add(st);

		StudentComparator st1 = new StudentComparator();
		st1.setRoll(1);
		st1.setName("ABC");
		st1.setAddress("New Delhi");
		st1.setContact("2345678901");

		// st1.displayDetails();
		list.add(st1);

		System.out.println(list);

		Collections.sort(list, new Comparator<StudentComparator>() {

			@Override
			public int compare(StudentComparator o1, StudentComparator o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});

		//Lambda Function:-
		// Collections.sort(list, (StudentComparator o1, StudentComparator o2) -> {
		// 	return o1.getName().compareTo(o2.getName());
		// });
		//OR
		// Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println(list);
	}

}
