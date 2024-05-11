package com.crux.collection_framework.basics;

import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        
        dq.offerLast(2);   //This function is coming from ArrayDeque interface
        dq.offerFirst(1);  //This function is coming from ArrayDeque interface
        dq.offer(3);       //This function is coming from Queue interface. Similarly, peek & poll.
        dq.offer(4);

        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
    
}
