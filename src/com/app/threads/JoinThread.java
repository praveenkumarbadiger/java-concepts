package com.app.threads;

public class JoinThread {
	
	/*Waiting of main thread until its child completes or joins  */
	
	public static void main(String[] args) throws InterruptedException {
		RamSeethaThread seethaThread=new RamSeethaThread();
		seethaThread.start();
		// Rama(main method thread) will wait until seetha to join by completing her job.
		System.out.println("Rama waiting seetha to join.");
		seethaThread.join();
		System.out.println("Seetha joined Rama started to work");
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class RamSeethaThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Seetha Thread doing her work.");
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}