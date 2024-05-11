//package com.crux.thread;
//
//class ClassA implements Runnable{
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Thread A");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}
//class ClassB implements Runnable{
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Thread B");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}
//
//public class RunnableThread {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		ClassA A = new ClassA();
//		Runnable A = new ClassA();
//		Thread ThA = new Thread(A);
//		ThA.start();		
//		
////		ClassB B = new ClassB();
//		Runnable B = new ClassB();
//		Thread ThB = new Thread(B);
//		ThB.start();
//		
//		ThB.setPriority(Thread.MAX_PRIORITY);   //Not necessarily, priority will be set. Here you are only suggesting the scheduler with no guarantee that it will prioritize B thread. 
// 
//		System.out.println(ThB.getPriority());
//	}
//
//}