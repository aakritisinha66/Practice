package com.crux.thread;

public class LambdaRunnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable A = () -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread A");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		Thread ThA = new Thread(A);
		ThA.start();

		Runnable B = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread B");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		};
		Thread ThB = new Thread(B);
		ThB.start();

		ThB.setPriority(Thread.MAX_PRIORITY); // Not necessarily, priority will be set. Here you are only suggesting the
												// scheduler with no guarantee that it will prioritize B thread.

		System.out.println(ThB.getPriority());
	}

}
