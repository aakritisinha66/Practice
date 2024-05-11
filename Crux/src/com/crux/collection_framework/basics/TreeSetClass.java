package com.crux.collection_framework.basics;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<Integer>();
        
        set.add(21);
        set.add(12);
        set.add(36);
        set.add(75);
        set.add(85);
        System.out.println(set);

        set.clear();
        System.out.println(set);

    }
    
}
