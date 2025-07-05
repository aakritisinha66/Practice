package com.interviewPractice;

public class FibonacciRecursion {
    /// 0 1 1 2 3 5 8 13 ...
    public static void fibonacci(int firstEl, int secondEl, int i, int count) {
        if(i==count) return;
        int result = firstEl + secondEl;
        System.out.println(result);
        fibonacci(secondEl, result, i+1, count);
        
    }
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");
        fibonacci(0, 1, 3, 9);
    }
}
