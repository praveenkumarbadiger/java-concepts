package com.app.threads;

public class ObjectLokingThread {

	public static void main(String[] args){
		Object1 ob1=new Object1();
		LockPusuingThread.ob1=ob1;
		LockPusuingThread thread1=new LockPusuingThread();
		thread1.start();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		ob1.Object1Method();
	}
}
class Object1{
	synchronized void Object1Method() {  // add synchronized   -->and check output
		for (int i = 0; i < 3 ; i++) {
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(Thread.currentThread().getName()+ " is executing "+this.getClass().getName()+" class method.");
		}
	}
}

class LockPusuingThread extends Thread{
	static Object1 ob1;
	
	public void run() {  
		ob1.Object1Method();
	}
}