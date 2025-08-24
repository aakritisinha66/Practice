package com.interviewPracticeII;

abstract class AbstractClassMain {
    
    abstract void abs_method();

    void concrete_method() {
        System.out.println("Concrete Method");
    }
}

class SubClass extends AbstractClassMain {

    @Override
    void abs_method() {
        System.out.println("Implemented Sub Class");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        AbstractClassMain abs = new SubClass();
        abs.abs_method();
        abs.concrete_method();
    }
    
}