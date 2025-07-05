package com.neetCode250;
// Dutch National Flag algorithm.

// While mid <= hi, do:

// ▶ Case 1: If arr[mid] == 0 → it's red
// Swap with arr[lo]
// lo++, mid++
// (because all 0s must go to left side)

// ▶ Case 2: If arr[mid] == 1 → it's white
// Just mid++
// (1 is already in the middle)

// ▶ Case 3: If arr[mid] == 2 → it's blue
// Swap with arr[hi]
// hi-- (but don't move mid because the new value at mid might be 0/1/2)

public class sortColor {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while(mid<=high) {
                if(nums[mid] == 0) {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1) {
                    mid++;
                }
                else{
                    swap(nums, mid, high);
                    high--;
                }
            }
        }

    public static void main(String[] args) {
        int[] nums = {2, 1, 0};
        sortColors(nums);
        for(int num: nums) {
            System.out.println(num);
        }
    }
}
