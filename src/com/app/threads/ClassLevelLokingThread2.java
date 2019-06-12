package com.app.threads;

public class ClassLevelLokingThread2 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Counter.incrementingInteger();
			}
		}).start();
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		new Thread(new Runnable() {
			@Override
			public void run() {
				Counter.incrementingCharacter();
			}
		}).start();
	}
}

class Counter {
	static int intgerIncrement;
	static char characterIncrement='a';

	static synchronized void incrementingInteger() {
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(Thread.currentThread().getName() + " Thread incrementing number " + intgerIncrement);
			intgerIncrement++;
		}
	}

	static synchronized void incrementingCharacter() {
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(Thread.currentThread().getName() + " Thread incrementing character " + (char) characterIncrement);
			characterIncrement++;
		}
	}
}
