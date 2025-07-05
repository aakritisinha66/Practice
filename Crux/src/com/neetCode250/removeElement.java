package com.neetCode250;

public class removeElement {
    public static int removeElements(int[] nums, int val) {
        int pointer = 0;   //new array position
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4 };
        int val = 1;

        int k = removeElements(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
