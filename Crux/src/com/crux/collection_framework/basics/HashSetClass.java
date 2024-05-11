package com.crux.collection_framework.basics;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        
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
