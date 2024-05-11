package com.crux.collection_framework.basics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

    public static void main(String[] args){
        // Queue<Integer> pq = new PriorityQueue<Integer>();   //min-heap representation
        Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());     //max-heap representation

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
    
}
