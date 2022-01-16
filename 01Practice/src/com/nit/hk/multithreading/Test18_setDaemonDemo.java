package com.nit.hk.multithreading;

class DaemonDemo implements Runnable{

	public DaemonDemo(boolean on) {
		Thread th = new Thread(this);
		th.setDaemon(on);
		th.start();
	}
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.getName()+" run: "+i);
		}
	}
}

public class Test18_setDaemonDemo {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		DaemonDemo dd1 = new DaemonDemo(true);
		DaemonDemo dd2 = new DaemonDemo(false);
		
		System.out.println("Main End");
	}
}