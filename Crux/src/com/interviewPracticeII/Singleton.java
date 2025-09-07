package com.interviewPracticeII;

//Eager
public class Singleton {
    private static Singleton singletonInstance = new Singleton();
    private Singleton() { }

    public static Singleton getInstance() {
        return singletonInstance;
    }
}
//Lazy
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
//Thread Safe
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
//Double Checked Locking
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
//ENUM
public enum EnumSingleton {
    INSTANCE;
    private int value;
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void doSomething() {
        System.out.println("Enum singleton doing something with value: " + value);
    }
}
//ENUM Usage
public class Main {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue(100);
        singleton.doSomething(); // Enum singleton doing something with value: 100
    }
}

