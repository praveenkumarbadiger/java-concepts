package com.app.threads;

import java.util.Scanner;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		Thread t1 = new Thread(()-> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2 : 
		//if we remove also there is no impact of following lines
//		t1.join();
//		t2.join();
	}

	public static class PC {
		public void produce() throws InterruptedException {
			synchronized (this) {
				System.out.println("producer thread("+Thread.currentThread().getName()+") running");
				wait();
				System.out.println("Producer thread("+Thread.currentThread().getName()+") got data");
			}
		}

		public void consume() throws InterruptedException {
			Thread.sleep(1000);
			Scanner s = new Scanner(System.in);
			synchronized (this) {
				System.out.println("Consumer thread("+Thread.currentThread().getName()+") running. Hello user prvide data and enter.");
				s.nextLine();
				System.out.println("Thank user for the data");
				notify();
				Thread.sleep(2000);
			}
		}
	}
}

