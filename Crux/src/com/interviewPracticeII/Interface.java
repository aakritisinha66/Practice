package com.interviewPracticeII;

interface Interface {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a*b;
    }
    static void info() {
        System.out.println("I am a calculator");
    }
    private void log(String msg) {
        System.out.println("Log: "+msg);
    }
}