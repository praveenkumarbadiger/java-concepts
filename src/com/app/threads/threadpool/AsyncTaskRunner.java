package com.app.threads.threadpool;

public class AsyncTaskRunner{

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread=new Thread(new Task());
			thread.start();
		}
		System.out.println("Thread Name "+ Thread.currentThread().getName());
	}

	static class Task implements Runnable{
		public void run() {
			System.out.println("Thread Name "+ Thread.currentThread().getName());
			
		}
	}
}
