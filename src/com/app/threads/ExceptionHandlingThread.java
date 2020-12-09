package com.app.threads;

public class ExceptionHandlingThread {

	public static void main(String[] args) {
		ExceptionThread thread=new ExceptionThread();
		thread.start();
		ExceptionThread thread1=new ExceptionThread();
		thread1.start();
		ExceptionThread thread2=new ExceptionThread();
		thread2.start();
		ExceptionThread thread3=new ExceptionThread();
		thread3.start();

	}
}
class ExceptionThread extends Thread{
	public void run()  {
		synchronized (this) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(Thread.currentThread().getName() + " Thread is executing and facing exception.");
			System.out.println(10/0);
		}
	}
}