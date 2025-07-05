package com.neetCode250;

import java.util.Scanner;

class concatenationOfArray {
    public static void getConcatenation(int[] nums) {

        int[] ansArr = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ansArr[i] = nums[i];
            ansArr[i + nums.length] = nums[i];
        }
        for (int i = 0; i < ansArr.length; i++) {
            System.out.println(ansArr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getConcatenation(arr);
    }
}