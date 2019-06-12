package com.app.threads;

public class WaitNotify2 {

	public static void main(String[] args) throws InterruptedException {
		ValueProducerConsumer valueProducerConsumer=new  ValueProducerConsumer();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t5 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					valueProducerConsumer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});


		// Start all threads
		t1.start();
		producer.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		/*// t1 finishes before t2
		t1.join();
		t2.join();*/
	}
}

class ValueProducerConsumer {
	int x;
	public void produce() throws InterruptedException {
		synchronized (this) {
			x = 10;
			System.out.println(Thread.currentThread().getName()+ " is updating X value is : " + x);
			Thread.sleep(1000);
			notifyAll();
		}
	}

	public void consume() throws InterruptedException {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+ " is accessing X value is : " + x);
			if (x == 0) {
				wait();
			}
			System.out.println(Thread.currentThread().getName()+ " is updated X value is : " + x);
		}
	}
}
