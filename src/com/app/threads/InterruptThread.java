package com.app.threads;

public class InterruptThread {

	public static void main(String[] args) {
		ChildThread1 child=new ChildThread1();
		child.start();
		//child.interrupt();
		System.out.println("End of  Main thread");
	}
}

class ChildThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread executing....");
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}