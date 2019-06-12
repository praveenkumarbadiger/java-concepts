package com.app.threads;

// main thread object is assigned through static variable in child thread class
public class JoinThread2 {
	public static void main(String[] args) throws InterruptedException {
		ChildThread.main=Thread.currentThread();
		ChildThread child=new ChildThread();
		child.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
class ChildThread extends Thread {
	static Thread main;
	public void run() {
		try {main.join();} catch (InterruptedException e) {e.printStackTrace();}
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}
//---> main thread object is assigned through constructor in child thread class <------
/*public class JoinThread2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChildThread child=new ChildThread(Thread.currentThread());
		child.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
class ChildThread extends Thread {
	Thread main;
	ChildThread(Thread main){
		this.main=main;
	}
	public void run() {
		try {main.join();} catch (InterruptedException e) {e.printStackTrace();}
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}*/		
