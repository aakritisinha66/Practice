package com.crux.thread;

class ThreadA extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread A");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class ThreadB extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread B");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA A = new ThreadA();
		A.start();
		
		
		ThreadB B = new ThreadB();
		B.start();
		
		B.setPriority(Thread.MAX_PRIORITY);   //Not necessarily, priority will be set. Here you are only suggesting the scheduler with no guarantee that it will prioritize B thread. 
  
	}

}