package com.app.threads;

import java.util.ArrayList;
import java.util.List;

public class WaitNotify3 {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");

		tConsumer.start();
		
		Thread.sleep(2000);
		// Start both threads
		tProducer.start();

		// t1 finishes before t2
		
	}
}

class Producer implements Runnable {
	private List<Integer> taskQueue;
	private int MAX_CAPACITY;

	public Producer(List<Integer> sharedQueue, int size) {
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = size;
	}

	@Override
	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void produce() throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "+ taskQueue.size());
				taskQueue.wait();
			}
			while (MAX_CAPACITY > 0) {
				taskQueue.add(MAX_CAPACITY);
				MAX_CAPACITY--;
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " Producing: " + MAX_CAPACITY);
			}
			taskQueue.notifyAll();
		}
	}
}

class Consumer implements Runnable {
	private final List<Integer> taskQueue;

	public Consumer(List<Integer> sharedQueue) {
		this.taskQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			consume();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	private void consume() throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "+ taskQueue.size());
				taskQueue.wait();
			}
			
			for(Integer i :taskQueue) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() +  "Consuming: " + i);
			}
			taskQueue.notifyAll();
		}
	}
}
