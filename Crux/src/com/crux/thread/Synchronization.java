package com.crux.thread;

class Counter {
	int count;
	public synchronized void increament() {
		count++;
	}
}

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		Counter C = new Counter();
		
		Runnable obj1 = () -> {
			for(int i=0; i<10000; i++) {
				C.increament();
			}
		};
		Thread thread1 = new Thread(obj1);
		thread1.start();
		
		Runnable obj2 = () -> {
			for(int i=0; i<10000; i++) {
				C.increament();
			}
		};
		Thread thread2 = new Thread(obj2);
		thread2.start();
		
		// Wait for both threads to complete
        thread1.join();
        thread2.join();
		
        // Print the final count after both threads have completed
		System.out.println(C.count);
	}

}
