package com.nit.hk.multithreading;

class MyThread24 extends Thread{
	@Override
	public void run() {
		System.out.println("Run");
	}
}

public class Test24_yield {

	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread24 mt = new MyThread24();
		mt.start();
		
		Thread.yield();
		System.out.println("Main End");
	}
}
