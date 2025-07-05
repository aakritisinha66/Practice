package com.neetCode250;

import java.util.HashMap;

// Input: nums = [5,5,1,1,1,5,5]
// Output: 5

public class majorityElements {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int num: nums) {
            // if(!frequency.containsKey(num)) frequency.put(num, 1);
            // else frequency.put(num, frequency.get(num)+1);
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            if(frequency.get(num)>nums.length/2) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 4, 1 };

        int num = majorityElement(nums);
        System.out.println(num);
    }
}
