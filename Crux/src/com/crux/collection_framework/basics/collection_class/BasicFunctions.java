package com.crux.collection_framework.basics.collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicFunctions {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        System.out.println("Index: "+Collections.binarySearch(list, 2));
        System.out.println("Minimum: "+Collections.min(list));
        System.out.println("Maximum: "+Collections.max(list));
        System.out.println("Occurence: "+Collections.frequency(list, 2));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        
    }
    
}
