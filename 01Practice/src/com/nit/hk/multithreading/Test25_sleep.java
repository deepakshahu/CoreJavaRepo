package com.nit.hk.multithreading;

class MyThread25 extends Thread{
	@Override
	public void run() {
		System.out.println("Run Start");
		System.out.println("Run End");
	}
}

public class Test25_sleep {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");
		MyThread25 mt = new MyThread25();
		mt.start();
		
		Thread.sleep(5000);
		System.out.println("Main End");
	}
}
