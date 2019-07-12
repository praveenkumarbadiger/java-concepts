package com.app.threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		
		//for lot of short lived task
		ExecutorService service=Executors.newCachedThreadPool();
		//submit the task for execution
		for(int i=0; i<100;i++) {
			service.execute(new Task1());
		}
		service.shutdown();
		System.out.println("Thread Name "+ Thread.currentThread().getName());
	}
	static class Task1 implements Runnable{
		public void run() {
			System.out.println("Thread Name "+ Thread.currentThread().getName());
		}
	}
}
