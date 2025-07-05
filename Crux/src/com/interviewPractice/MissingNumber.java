package com.interviewPractice;

public class MissingNumber {
    // Given an array of non-duplicating numbers from 1 to n 
    // where one number is missing, write an efficient java program to find that missing number.
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 4, 5};
        int sumOfN = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sumOfN-sum);
    }
}
