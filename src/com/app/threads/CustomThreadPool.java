package com.app.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPool {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 9; i++){
            service.execute(new Runnable(){
                 public void run(){
                    int a = 4, b = 0;
                    System.out.println("a and b=" + a + ":" + b);
                    System.out.println("a/b:" + (a / b));
                    System.out.println("Thread Name in Runnable after divide by zero:"+Thread.currentThread().getName());
                 }
            });
        }
        service.shutdown();
	}
}
/* Here in this example at line 15, If two threads are executing and they encounters exception,process will be 
 * terminated and thread ends. here pool size 2 two threads are terminated 
 * 
 * For next iteration it will creates threads for execution.
 * 
 * If NO Exception is occurred.
 * pool uses two threads for next subsequent tasks.
 **/
/*----------------------------------------------------------------------------------------------------*/

 class CustomThreadPool1 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}

class WorkerThread implements Runnable {
	private String command;

	public WorkerThread(String s) {
		this.command = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	@Override
	public String toString() {
		return this.command;
	}
}



