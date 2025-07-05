package com.interviewPractice;

public class Factorial {
    // 6:- 6*5*4*3*2*1

    public static int factorial(int number) {
        if(number == 1) return 1;
        return number * factorial(number-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
