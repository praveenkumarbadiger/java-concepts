package com.app.threads;

public class ObjectLokingUsingSyncMethodsThread {

	public static void main(String[] args){
		Display d=new Display();
		//Display d1=new Display();
		Screen screen=new Screen("6", "100*780");
		Screen screen1=new Screen("6", "100*780");
		MyThread t1=new MyThread(d, "Pravenkumar",screen);
		MyThread t2=new MyThread(d, "Sachin",screen1); // change d to d1 to execute simultaneously
		t1.start();
		t2.start();
		/*try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		d.show("main");
		System.out.println(screen.getScreenInfo()); */
	}
}
class Display{
	public synchronized void viewDisplay(String name,Screen screen ) { // change signature to --> public static synchronized void view(String name ) {  -->and check
		for (int i = 0; i < 3 ; i++) {
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(screen.getScreenInfo()+" belongs to "+name);
		}			
	}
	public  void show(String name ) {  // add synchronized   -->and check output
		System.out.println(" In Show method "+ name);
	}
}

class Screen {
	String size;
	String resolution;
	Screen(String size,String resolution){
		this.size=size;
		this.resolution=resolution;
	}
	 
	synchronized String  getScreenInfo() { // add synchronized   -->and check output
		return "Screen size: "+size+" inches and resolution :  "+resolution +" pixels ";
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	Screen screen;
	public MyThread(Display d,String name,Screen screen) {
		this.d=d;
		this.name=name;
		this.screen=screen;
	}
	public void run() {
		d.viewDisplay(name,screen);
		//d.view(Thread.currentThread().getName());
		//d.show(Thread.currentThread().getName());
	}
}