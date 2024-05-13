package com.crux.oops.singleton;

class LazySingleton {
    public static void main(String[] args) {
        Runnable task = () -> {
            MultithreadSingleton obj = MultithreadSingleton.getInstance();
            System.out.println("Thread: "+Thread.currentThread().getName());
        };
        Thread task1 = new Thread(task);
        task1.start();

        Thread task2 = new Thread(task);
        task2.start();
        
    }
}

public class MultithreadSingleton {
    private static MultithreadSingleton obj;
    private MultithreadSingleton() {
        System.out.println("Singleton");
    }
    public static synchronized MultithreadSingleton getInstance() {
        if(obj==null) {
            obj = new MultithreadSingleton();
        }
        return obj;

    }
    
}
