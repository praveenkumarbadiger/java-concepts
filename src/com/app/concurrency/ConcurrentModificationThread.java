package com.app.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationThread extends Thread {
	static List list = new CopyOnWriteArrayList(); // chage to CopyOnWriteArrayList<>(); , then we wont get ConcurrentModificationExecption 
	//static List list = new ArrayList();
	public void run() {
		try {Thread.sleep(2000);} 
		catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("Child Thread updating list");
		list.add("D");
	}
	public static void main(String[] args) throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");
		ConcurrentModificationThread thread=new ConcurrentModificationThread();
		thread.start();
		Iterator itr =  list.iterator();
		while(itr.hasNext()) {
			String st1=(String) itr.next();
			System.out.println("Main thread iterating list and current object is "+st1);
			Thread.sleep(3000);
		}
		System.out.println(list);
	}
}
