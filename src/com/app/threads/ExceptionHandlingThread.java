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
		System.out.println(10/0);
	}
}