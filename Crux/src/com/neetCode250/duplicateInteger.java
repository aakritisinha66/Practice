package com.neetCode250;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicateInteger {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for(int number: nums) {
            if(set1.contains(number)) return true;
            set1.add(number);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(hasDuplicate(arr));
    }
}
