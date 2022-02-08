package com.app.threads;

public class InterruptThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread1 child=new ChildThread1();
		child.start();
		
		Thread.sleep(8000);
		child.interrupt();     // Uncomment this line to see interrupt() method effect
		System.out.println("End of  Main thread and name : "+Thread.currentThread().getName() );
	}
}

class ChildThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() +" child thread executing....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted by other thread at index "+i+". "+e.getMessage());
			}
		}
	}
}