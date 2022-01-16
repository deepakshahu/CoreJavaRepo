package com.nit.hk.multithreading;

class Addition1{
	
	private static int x;
	private static int y;
	
	public static synchronized void add(int x,int y) {
		
		Addition1.x=x;
		Addition1.y=y;

		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		int z = Addition1.x + Addition1.y;
		System.out.println(Thread.currentThread().getName()+" addition result is: "+z);
	}
}

class Thread3 extends Thread{
	
	public void run() {
		Addition1.add(70,80);
	}
}

class Thread4 extends Thread{
	
	public void run() {
		Addition1.add(50,20);
	}
}

public class Test28_sych_CL {

	public static void main(String[] args) {
		new Thread3().start();
		new Thread4().start();
	}
}