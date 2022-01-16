package com.nit.hk.multithreading;

class MyThread17 extends Thread{
	@Override
	public void run() {
		System.out.println("Run start");
		for(int i=1; i<=100; i++) {
			System.out.println("Run "+i);
		}
		System.out.println("Run end");
	}
}

public class Test17_setDaemon {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyThread17 mt = new MyThread17();
		mt.setDaemon(true);
		mt.start();
		//mt.setDaemon(true);
		
		System.out.println("Main end");
	}
}