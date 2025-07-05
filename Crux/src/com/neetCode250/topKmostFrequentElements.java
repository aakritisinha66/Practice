package com.neetCode250;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKmostFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i],freq.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 2, 2, 4 };
        int[] result = topKFrequent(nums, 2);
        for(int res: result) {
            System.out.println(res);
        }
    }
}
