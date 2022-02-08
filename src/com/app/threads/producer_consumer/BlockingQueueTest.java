package com.app.threads.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
		
		OrderConsumer consumer = new OrderConsumer(queue);
		OrderProducer producer = new OrderProducer(queue);
		
		new Thread(consumer).start();
		new Thread(producer).start();

	}

}
