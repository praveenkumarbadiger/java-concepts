package com.app.threads;

public class ClassLevelLokingThread {
	public static void main(String[] args) {
		GreekThread g = new GreekThread();
		GreekThread g1 = new GreekThread();
		g.start();
		g1.start();
	}
}

class GreekThread extends Thread {
	public void run() {
//		Student.getCollege();
		synchronized (GreekThread.class) {
			printCurrentThread();
		}
		//synchronized (GreekThread.class) {
			methodDoesNotHaveClassLock();
		//}
	}
	
	public static void printCurrentThread() {
		for (int i = 0; i < 3; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void methodDoesNotHaveClassLock() {
		for (int i = 0; i < 3; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() +" Thread executing without Class Level Lock!!!!");
		}
	}
	
}

class Student{
	String name="Praveen";
	static String  college="DSCE";
	
	/*static void getCollege() {
		System.out.println(Thread.currentThread().getName() + " thread is getting college.");
		synchronized (Student.class) {
			for (int i = 0; i < 3; i++) {
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				System.out.println("Exected by "+Thread.currentThread().getName() + " to get college name is  "+college);
			}			
		}
		System.out.println(Thread.currentThread().getName() + " thread is got college.");
	}*/  
	
	// Above in thread you are calling this method [Student.getCollege();] by obtaining Class Lock,
	//Note : U remove synchronized, then test, u'll get improper result 
	static synchronized void getCollege() {
		System.out.println(Thread.currentThread().getName() + " thread is getting college.");
			for (int i = 0; i < 3; i++) {
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				System.out.println("Exected by "+Thread.currentThread().getName() + " to get college name is  "+college);
			}			
		System.out.println(Thread.currentThread().getName() + " thread is got college.");
	}
}
