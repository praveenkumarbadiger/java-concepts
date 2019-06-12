package com.app.threads;

public class ObjectLokingUsingSyncBlocksThread {

	public static void main(String[] args){
		Display d=new Display();
		//Display d1=new Display();
		Screen screen=new Screen("6", "100*780");
		MyThread t1=new MyThread(d, "Pravenkumar",screen);
		//MyThread t2=new MyThread(d1, "Sachin",screen);
		MyThread t2=new MyThread(d, "Sachin",screen);
		t1.start();
		t2.start();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		d.show("main");
		System.out.println(screen.getScreenInfo()); 
	}
}
class Display1{
	public  void viewDisplay(String name,Screen1 screen ) { 
		synchronized(screen) {
			for (int i = 0; i < 3 ; i++) {
				try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
				System.out.println(screen.getScreenInfo()+" belongs to "+name);
			}			
		}

	}
	public  void show(String name ) {  // add synchronized   -->and check output
		System.out.println(" In Show method "+ name);
	}
}

class Screen1 {
	String size;
	String resolution;
	Screen1(String size,String resolution){
		this.size=size;
		this.resolution=resolution;
	}
	 
	synchronized String getScreenInfo() {  // add synchronized   -->and check output
		return "Screen size: "+size+" inches and resolution :  "+resolution +" pixels ";
	}
}

class MyThread1 extends Thread{
	Display1 d;
	String name;
	Screen1 screen;
	public MyThread1(Display1 d,String name,Screen1 screen) {
		this.d=d;
		this.name=name;
		this.screen=screen;
	}
	public void run() {  
		// In this case, 'MyThread1' is thread got lock of Display1 and Screen1 object, 
		//and releases lock of thread terminated means run method completed.
		
		d.viewDisplay(name,screen);
		//d.view(Thread.currentThread().getName());
		//d.show(Thread.currentThread().getName());
	}
}