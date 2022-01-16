package com.nit.hk.multithreading;

class Addition{
	
	private int x;
	private int y;
	
	public synchronized void add(int x,int y) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+" is running add() method");
		this.x=x;
		this.y=y;
		System.out.println(name+" stored given values in object");
		
		System.out.println(name+" is paused");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" is resumed");
		
		System.out.println(name+" is adding given values");
		int res = this.x + this.y;
		System.out.println("Addition result from "+name+" is: "+res);
	}
}

class Thread1 extends Thread{
	
	private Addition a;
	public Thread1(Addition a) {
		this.a=a;
	}
	public void run() {
		a.add(70,80);
	}
}

class Thread2 extends Thread{
	
	private Addition a;
	public Thread2(Addition a) {
		this.a=a;
	}
	public void run() {
		a.add(50,20);
	}
}

public class Test28_sych {

	public static void main(String[] args) {
		Addition a = new Addition();
		new Thread1(a).start();
		new Thread2(a).start();
	}
}