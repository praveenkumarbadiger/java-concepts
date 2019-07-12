package com.app.threads.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {

		// for scheduling tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		// task to run after 10 sec delay
		// service.schedule(new Task(),5,TimeUnit.SECONDS);

		// task to be run repeatedly every 5 sec
		ScheduledFuture<?> result = service.scheduleAtFixedRate(new Task(), 2, 5, TimeUnit.SECONDS);
		try {
			TimeUnit.MILLISECONDS.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdown();
		System.out.println("Thread Name " + Thread.currentThread().getName());
	}

	static class Task implements Runnable {
		public void run() {
			System.out.println("Thread Name " + Thread.currentThread().getName());
		}
	}
}
