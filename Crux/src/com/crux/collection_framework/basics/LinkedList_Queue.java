package com.crux.collection_framework.basics;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();

        // queue.add(0);    //It will throw an exception if addition is not successful.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(Integer.valueOf(4));

        System.out.println(queue);
        // System.out.println(queue.element());     //It will throw an exception if queue is empty.
        System.out.println(queue.peek());     
        // System.out.println(queue.remove());       //It will throw an exception if queue is empty.
        System.out.println(queue.poll());

        System.out.println(queue);
    }
    
}
