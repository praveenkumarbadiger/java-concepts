package com.app.threads.threadpool.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<Integer> future =service.submit(new Task());
		
		Integer result = future.get(); // blocking statement coz you will get response after 3 seconds
		System.out.println(result);
		Thread.sleep(2000);
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
	
	static class Task implements Callable<Integer>{
		@Override
		public Integer call() throws Exception {
			Thread.sleep(3000);
			return new Random().nextInt();
		}
	}

}
