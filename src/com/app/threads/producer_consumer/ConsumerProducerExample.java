package com.app.threads.producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerProducerExample {

	
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		Thread consumerThread = new Thread(new Consumer(list));
		Thread producerThread = new Thread(new Producer(list));
		
		consumerThread.start();
		
		producerThread.start();
		

	}

}

class Consumer implements Runnable{
	List<String> list;
	Consumer(List<String> list){
		this.list = list;
	}
	public void consume() throws InterruptedException {
		synchronized (list) {
			if(list.isEmpty()) {
				System.out.println("Consumer thread("+Thread.currentThread().getName()+") consuming data, but there is no data,\n So going to wait state");
				list.wait();
			}
			Thread.sleep(1000);
			for (String string : list) {
				Thread.sleep(1000);
				System.out.println("Consumer thread("+Thread.currentThread().getName()+") consuming data: "+string);
			}			
		}
	}
	@Override
	public void run() {
		try {
			consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable{
	List<String> list;
	Producer(List<String> list){
		this.list = list;
	}
	public void produce() throws InterruptedException {
		synchronized (list) {
			System.out.println("Producer thread("+Thread.currentThread().getName()+") is producing data");
			list.add("Praveen");
			list.add("kumar");
			list.add("badiger");
			System.out.println("Producer thread("+Thread.currentThread().getName()+") is updated data, So its notifying all threads to get updated!!");
			list.notifyAll();
			Thread.sleep(1000);
		}
	}
	@Override
	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}