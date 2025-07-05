package com.interviewPractice;

public class Fibonacci {
    /// 0 1 1 2 3 5 8 13 ...
    public static void fibonacci(int firstEl, int secondEl, int count) {
        int i = 3;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        while(i<=count){
            int result = a+b;
            a = b;
            b = result;
            System.out.println(result);
            i++;
        }
    }
    public static void main(String[] args) {
        fibonacci(0, 1, 9);
    }
}
