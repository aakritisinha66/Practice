package com.crux.oops.singleton;

class LazyInitializedSingleton {

    private static LazyInitializedSingleton obj;

    private LazyInitializedSingleton(){
        System.out.println("Singleton Object");
    }

    public static LazyInitializedSingleton getInstance() {
        if (obj == null) {
            obj = new LazyInitializedSingleton();
        }
        return obj;
    }
}

class EagerInitializedSingleton {

    private static EagerInitializedSingleton obj = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("Singleton Object");
    }

    public static EagerInitializedSingleton getInstance(){
        return obj;
    }
}

public class Client {
    public static void main(String[] args){
        // EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        // EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();  // obj2 will also refer to the first instance obj1.
        LazyInitializedSingleton obj3 = LazyInitializedSingleton.getInstance();

    }
    
}
